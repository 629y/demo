## 优化数据：

### sql的执行顺序：

​	select   字段   from  表名   where  ...  group by ... having...  order by...

**执行顺序是什么？**

```TEXT
1. 首先执行 where语句 过滤原始数据
2. 执行group by 进行分组
3. 执行having
4. select字段名
5. 执行order by
6. from表
```

### in和exists区别

in 表示查询某个范围的数据：

**查询速度：**

​	查询子查询里面如果说表数据量小的话，in比较快

**exists:**

- 用来测试子查询有没有产生任何结果，最终返回的是true 或false
- 如果子查询为true的话，系统就会执行外面的sql语句。 为false 整个sql语句将都不执行

sql语句：exists 返回的只是true 和false  因此只返回是1个数据 所以可以使用 select 1 或者select 'X'

```mysql
select * from store_user su where EXISTS (SELECT 1 from store_shop sp where sp.suid=su.id)
```

**查询速度：**

如果两个表一个比较小，一个是大表 ，它会把大表放到子查询中 

总结一下：

当子查询**表数据大**的时候使用 **exists**  表数据量小的时候 **in**



### Union 和union All

union，将两个表的查询结果进行合并，去除重复的数据，然后进行排序

```mysql

SELECT * from store_user
UNION
SELECT * FROM store_user2

```

union All 对两个表的结果集进行合并，包含重复行，不进行排序

```mysql
SELECT * from store_user
UNION ALL
SELECT * FROM store_user2
```

### ignore用法

用于插入的时候使用，插入会失败，但不会报错，会忽略错误，跳本次插入

比如：一个里面有上千条数据， 那么使用ignore 就是忽略失败条数 其他正常插入

```mysql
INSERT IGNORE into store_user VALUES(8,'荣荣',134564,15685249413)
```



### REPLACE替换

当数据库里面有原始的数据就会删除原来的数据，并且重新创建进去

```mysql
REPLACE into store_user VALUES(8,'荣荣2',15463,15685249413)
```



**如果实现不存在就插入，存在就更新**

on DUPLICATE key UPDATE  用法：

```mysql
INSERT IGNORE into store_user  VALUES(8,'荣荣2',15463,15685249413) on DUPLICATE key UPDATE shop_owner='马鸿举';
```

**重复和执行计划**

```mysql
SELECT DISTINCT shop_owner from store_user


-- 查询只显示重复的数据
SELECT shop_owner ,count(*) from store_user GROUP BY shop_owner HAVING count(shop_owner)>1

-- 列出重复的数据具体指的那些

select * from store_user where shop_owner in(SELECT shop_owner from store_user GROUP BY shop_owner HAVING count(shop_owner)>1)

-- 执行计划 查看需要优化的点
EXPLAIN select * from store_user where shop_owner in(SELECT shop_owner from store_user GROUP BY shop_owner HAVING count(shop_owner)>1)

```



## Mysql存储过程

### 概述

由MySQL5.0 版本开始支持存储过程。

如果在实现用户的某些需求时，需要编写一组复杂的SQL语句才能实现的时候，那么我们就可以将这组复杂的SQL语句集提前编写在数据库中，由JDBC调用来执行这组SQL语句。把编写在数据库中的SQL语句集称为存储过程。

**存储过程：**（PROCEDURE）是事先经过编译并存储在数据库中的一段SQL语句的集合。调用存储过程可以简化应用开发人员的很多工作，减少数据在数据库和应用服务器之间的传输，对于提高数据处理的效率是很有好处的。

**就是数据库 SQL 语言层面的代码封装与重用。**

存储过程就类似于Java中的方法，需要先定义，使用时需要调用。存储过程可以定义参数，**参数分为IN、OUT、INOUT类型三种类型**。

1. IN类型的参数表示接受调用者传入的数据；
2. OUT类型的参数表示向调用者返回数据；
3. INOUT类型的参数即可以接受调用者传入的参数，也可以向调用者返回数据。

**优点**
    存储过程是通过处理封装在容易使用的单元中，**简化了复杂的操作**。

1. 简化对变动的管理。如果表名、列名、或业务逻辑有了变化。只需要更改存储过程的代码。使用它的人不用更改自己的代码。

2. 通常存储过程都是有助于提高应用程序的性能。当创建的存储过程被编译之后，就存储在数据库中。
3. 存储过程有助于减少应用程序和数据库服务器之间的流量。
   **因为应用程序不必发送多个冗长的SQL语句，只用发送存储过程中的名称和参数即可。**
4. 存储过程度任何应用程序都是可重用的和透明的。存储过程将数据库接口暴露给所有的应用程序，以方便开发人员不必开发存储过程中已支持的功能。

5. 存储的程序是安全的。数据库管理员是可以向访问数据库中存储过程的应用程序授予适当的权限，而不是向基础数据库表提供任何权限。


**缺点**

1. 如果使用大量的存储过程，那么使用这些存储过程的每个连接的内存使用量就会大大的增加。
   另外，如果在存储过程中过度使用大量的逻辑操作，那么CPU的使用率也在增加，因为MySQL数据库最初的设计就侧重于高效的查询，而不是逻辑运算。
2. 存储过程的构造使得开发具有了复杂的业务逻辑的存储过程变得困难。

3. 很难调试存储过程。MySQL不提供调试存储过程的功能。

4. 开发和维护存储过程都不容易。

5. 对数据库依赖程度较高，移值性差。


### MySQL存储过程的定义

**存储过程的基本语句格式**

```mysql
DELIMITER $$

CREATE
    /*[DEFINER = { user | CURRENT_USER }]*/
    PROCEDURE 数据库名.存储过程名([in变量名 类型,out 参数 2，...])
   
	BEGIN
		[DECLARE 变量名 类型 [DEFAULT 值];]
		存储过程的语句块;
	END$$

DELIMITER ;
```


● 存储过程中的参数分别是 in，out，inout三种类型；

1. in代表输入参数（默认情况下为in参数），表示该参数的值必须由调用程序指定。

2. out代表输出参数，表示该参数的值经存储过程计算后，将out参数的计算结果返回给调用程序。
3. inout代表即时输入参数，又是输出参数，表示该参数的值即可有调用程序制定，又可以将inout参数的计算结果返回给调用程序。

● 存储过程中的语句必须包含在BEGIN和END之间。

● DECLARE中用来声明变量，变量默认赋值使用的DEFAULT，语句块中改变变量值，使用SET 变量=值；

**案例导入**

```mysql
DELIMITER $$

CREATE PROCEDURE db.demo10()
	-- 存储过程体
	BEGIN
		-- DECLARE 声明变量
		DECLARE de_name VARCHAR(10) DEFAULT '';
		SET de_name = "xiaoyan";
		-- 测试输出语句
		SELECT de_name;
	END$$

DELIMITER ;

--调用方式：
call demo10();
```

![image-20230605214430682](D:\新建文件夹\java\javase\senlin\demo\CSS\Mysql存储过程\image-20230605214430682.png)



**根据条件查询，里面传参数：**

```mysql
DELIMITER $$

CREATE PROCEDURE db.demo9(IN s_age VARCHAR(1),OUT s_count INT)

-- 存储体
	BEGIN
		-- 把sql中查询的结果通过INTO 赋值给变量
			SELECT COUNT(*) INTO s_count FROM student1 WHERE age = s_age;
			SELECT s_count;
	
	END$$

DELIMITER ;

-- 调用方式
CALL demo9('女',@s_count);
```

![image-20230605214256840](D:\新建文件夹\java\javase\senlin\demo\CSS\Mysql存储过程\image-20230605214256840.png)

**定义一个流程控制语句 if else**

```mysql
DELIMITER $$

CREATE PROCEDURE db.demo8(IN day INT)

-- 存储体
	BEGIN
		 IF day = 0 THEN
		 SELECT '星期天';
		 ELSEIF day = 1 THEN
		 SELECT '周期一';
		 ELSEIF day = 2 THEN
		 SELECT '周期二';
		ELSE
		SELECT '无效日期';
		END IF;
		
	END$$

DELIMITER ;
-- 调用函数
CALL demo8(5);
```

![image-20230605213935553](D:\新建文件夹\java\javase\senlin\demo\CSS\Mysql存储过程\image-20230605213935553.png)

-- 定义一个条件查询 CASE

```mysql
DELIMITER $$

CREATE PROCEDURE demo7(in num int)
	BEGIN
		CASE		

	WHEN num < 0 THEN
		SELECT '负数';
	WHEN num > 0 THEN
		SELECT '正数';
	ELSE
		SELECT '不是正数也不是负数';

  END CASE;

END$$

DELIMITER ;

-- 调用函数
call demo7(1)
```

![image-20230605213518025](D:\新建文件夹\java\javase\senlin\demo\CSS\Mysql存储过程\image-20230605213518025.png)

**CASE WHEN的语法**

```mysql
CASE case_value
	WHEN when_value THEN
		statement_list
	ELSE
		statement_list
END CASE;

```

定值写法：

```mysql
DELIMITER $$

CREATE PROCEDURE demo6(in num int)
	BEGIN
		CASE num
	WHEN 1 THEN
		SELECT '输入的数字为：1';
	WHEN 0 THEN
	  SELECT '输入的数字为：0';
	
	ELSE
		SELECT '我还没有长大，等我长大了在告诉你';
END CASE;

	END$$

DELIMITER ;

-- 调用
CALL demo6(2);
```

![image-20230605213421140](D:\新建文件夹\java\javase\senlin\demo\CSS\Mysql存储过程\image-20230605213421140.png)

循环的用法： 定义一个循环 WHILE

```mysql
DELIMITER $$
CREATE PROCEDURE demo5(in num int,OUT sum INT)
	BEGIN
		SET sum = 0;
		WHILE num < 10 DO -- 循环开始
			Set num= num + 1;
			Set sum=sum+num;
	END WHILE;  -- 循环结束


	END$$
DELIMITER ;


-- 调用函数并设定初始值
CALL demo5(0,@sum);

-- 查询函数
SELECT @sum
```

![image-20230605213304750](D:\新建文件夹\java\javase\senlin\demo\CSS\Mysql存储过程\image-20230605213304750.png) 

定义一个循环 repeat UNTIL  类似于java的 do while

都是先执行循环操作，在执行判断条件，repeat 表达式值为false时才执行 直到true时候停止

```mysql
DELIMITER $$
CREATE PROCEDURE demo4(in num int,OUT sum INT)
	BEGIN
		SET sum = 0;
		REPEAT -- 循环开始 类似do
	    set num=num+1;
			set sum=sum+num;
			
   UNTIL num >=10  -- 循环条件
END REPEAT; -- 循环结束

	END$$

DELIMITER ;
-- 调用
CALL demo4(9,@sum);

SELECT @sum;
```

![image-20230605213138812](D:\新建文件夹\java\javase\senlin\demo\CSS\Mysql存储过程\image-20230605213138812.png)

- **-- loop 也是一个循环 用来重复执行某些语句**
- -- label 标签也就是名字
- -- LEAVE 相当于java 里面break 用来终止循环
- -- iterate 相当于java里面 continue 用来跳过本次循环

```mysql
delimiter $$
CREATE PROCEDURE demo1(in num int,OUT sum INT)
	BEGIN
		SET sum = 0;
		demo_sum: LOOP
	SET num = num + 1;

	IF num > 10 THEN
		LEAVE demo_sum; -- 结束本次循环
		ELSEIF num <= 9 THEN
		ITERATE demo_sum;-- 跳过本次循环
	END IF; 
	SET sum = sum + num;
END LOOP demo_sum;-- 结束循环
END $$
delimiter ;

--调用函数：
CALL demo1(0,@sum);
SELECT @sum;
```

![image-20230605140406662](D:\新建文件夹\java\javase\senlin\demo\CSS\Mysql存储过程\image-20230605140406662.png)

**插入一条数据：**

```mysql
-- 插入数据
DELIMITER $$
CREATE PROCEDURE demo3(in s_student VARCHAR(20),IN s_age Int,OUT s_result VARCHAR(20))
	BEGIN
		-- 声明一个变量 用来决定这个名字是否已经存在了
		DECLARE s_count INT DEFAULT 0;
		-- 验证这个名字是否存在
		SELECT count(*) INTO s_count FROM student WHERE name=s_student;
		if s_count = 0 THEN
			INSERT INTO student1 (name,age) VALUES(s_student,s_age);
			set s_result="数据添加成功";
		else
			set s_result="名字已经存在，数据添加失败";
			select s_result;
		END if;
	END$$
DELIMITER ;

-- 调用
call demo3("高启盛",30,@s_result);
```

![image-20230605140050523](D:\新建文件夹\java\javase\senlin\demo\CSS\Mysql存储过程\image-20230605140050523.png)

**循环插入**

```mysql
DROP PROCEDURE test;--如果存在就删除，如果不存在就 报错

delimiter $$
	CREATE PROCEDURE test()
		BEGIN
		--DECLARE 声明一个变量
		DECLARE i INT DEFAULT 0;
		WHILE i < 100 DO
	INSERT INTO student(id,name,age) VALUES(i,'小+i',i);
	SET i = i + 1;
END WHILE;
COMMIT;--提交
	END $$
delimiter ;

--调用
call test();
```

![image-20230605140113535](D:\新建文件夹\java\javase\senlin\demo\CSS\Mysql存储过程\image-20230605140113535.png)

存储过程的显示：

```mysql
show PROCEDURE STATUS
```

![image-20230605140138895](D:\新建文件夹\java\javase\senlin\demo\CSS\Mysql存储过程\image-20230605140138895.png)
