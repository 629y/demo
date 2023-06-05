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

CALL demo1(0,@sum);
SELECT @sum;


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

SHOW CREATE TABLE student;

CREATE TABLE `student1` (
  `id` int NOT NULL  auto_increment,
  `name` varchar(20) DEFAULT NULL,
  `age` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3

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

call test();

--存储过程的显示：
show PROCEDURE STATUS

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
call demo7(1);

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