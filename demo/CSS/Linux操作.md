# Linux操作

## 一、Linux操作

##### 1.安装yum包：

```bash
$ yum install PACKAGE_NAME
yum install mysql
```

![image-20230605191113136](D:\新建文件夹\java\linus\Linux操作\image-20230605191113136.png)

##### 2.取出yum包装：

```bash
$ yum remove PACKAGE_NAME
yum remove mysql
```

##### 3.重新安装一个yum包：

```bash
$ yum reinstall PACKAGE_NAME
yum reinstall mysql
```

##### 4.搜索yum包：

```bash
$ yum search PACKAGE_NAME
yum search mysql
```

![image-20230605191254197](D:\新建文件夹\java\linus\Linux操作\image-20230605191254197.png)

##### 5.显示yum包的信息：

```bash
$ yum info PACKAGE_NAME
yum info mysql
```

![image-20230605191342561](D:\新建文件夹\java\linus\Linux操作\image-20230605191342561.png)

##### 6.更新安装的yum包：

```bash
$ yum update   #更新是更新源，就是更新这个服务
```

##### 7.更新具体的yum包：

```bash
$ yum update PACKAGE_NAME
yum update mysql
```

##### 8.显示yum历史：

```bash
$ yum history  #查看你敲过的历史命令
yum history |grep mysql    #过滤mysql的意思 只显示mysql的东西
```

![image-20230605191558662](D:\新建文件夹\java\linus\Linux操作\image-20230605191558662.png)

![image-20230605191502174](D:\新建文件夹\java\linus\Linux操作\image-20230605191502174.png)

##### 9.显示已启用的yum存储库的列表：

```bash
$ yum repolist  
```

![image-20230605191625107](D:\新建文件夹\java\linus\Linux操作\image-20230605191625107.png)

##### 10.找出哪个yum包提供了一个特定的文件（例如：/usr/bin/nc)）：

```bash
$ yum whatprovides "*bin/nc"  #直接输入
```

![image-20230605191741834](D:\新建文件夹\java\linus\Linux操作\image-20230605191741834.png)

##### 11.清除yum缓存：

```bash
$ yum clean all   #清的缓存并不是输入的命令 而是搜索的历史记录
#比如 在执行yum history 会重新的抓取重新搜索
```

这是装软件的操作：

比如安装docker：

```bash
yum insatll  docker
```

## 二、vim简单试用

### 1.vim简单试用

vi / vim 最linux比较流行的编辑器，相当于windows系统notepad.exe 记事本。

>  $ vim demo.java

> 输入 i 进入插入模式，可以编辑

> 按下Esc键，输入

> :wq保存退出 

> :w abc.java 另存为

> :w 保存 输入

> :q 退出 

> :q! 强制不保存并退出

### 2.vim 共分为三种模式，分别是**命令模式（Command mode）**，**输入模式（Insert mode）**和**底线命令模式（Last line mode）**。 

### 1>命令模式：

用户刚刚启动 vi/vim，便进入了命令模式。

此状态下敲击键盘动作会被Vim识别为命令，而非输入字符。比如我们此时按下i，并不会输入一个字符，i被当作了一个命令。

以下是常用的几个命令：

- **i** 切换到输入模式，以输入字符。

- **x** 删除当前光标所在处的字符。

- **:** 切换到底线命令模式，以在最底一行输入命令。

若想要编辑文本：启动Vim，进入了命令模式，按下i，切换到输入模式。

命令模式只有一些最基本的命令，因此仍要依靠底线命令模式输入更多命令。

### 2>输入模式

在命令模式下按下i就进入了输入模式。

在输入模式中，可以使用以下按键：

- **字符按键以及Shift组合**，输入字符

- **ENTER**，回车键，换行

- **BACK SPACE**，退格键，删除光标前一个字符

- **DEL**，删除键，删除光标后一个字符

- **方向键**，在文本中移动光标

- **HOME**/**END**，移动光标到行首/行尾

- **Page Up**/**Page Down**，上/下翻页

- **Insert**，切换光标为输入/替换模式，光标将变成竖线/下划线

- **ESC**，退出输入模式，切换到命令模式

### 3>底线命令模式

在命令模式下按下  **:**（英文冒号）就进入了底线命令模式。

底线命令模式可以输入单个或多个字符的命令，可用的命令非常多。

在底线命令模式中，基本的命令有（已经省略了冒号）：

- q 退出程序

- w 保存文件

##### 1.查找

```bash
/port  #从上往下找  示例  :/port  /p
?port #从下往上找
```

回车后，可以通过 n 查找下一个， N查找上一个。

##### 2.显示行号

```bash
:set nu  #显示行号
:set nonu   #取消显示行号
```

##### 3.跳到最后一行

```bash
:$::
```

##### 4.常用其它

【:w】 保存文件 :w 

【:w!】 若文件为只读，强制保存文件 

【:q】 离开vi，如果编辑了不保存，可以使用 :q! 强制退出 

【:q!】 不保存强制离开vi 

【:wq】 保存后离开 

【:wq!】 强制保存后离开 

【:w newfile】 另存为 

【:set fileencoding】 查看当前文件编码格式 

【:set fileencoding=utf-8】 设置当前文件编码格式为utf-8，也可以设置成其他编码格式 

【:set fileformat】 查看当前文件的断行格式（dos\windows,unix或macintosh） 

【:set fileformat=unix】 将当前文件的断行格式设置为unix格式 



## 三、常用命令

#### 1.版本信息

```bash
cat #命令就是查看的意思：
cat 123.txt 
cat demo.Java
cat /etc/os-release  #查看操作系统
```

![image-20230605193832516](D:\新建文件夹\java\linus\Linux操作\image-20230605193832516.png)

```bash
#查看linux 内核信息
cat /proc/version
```

![image-20230605193859932](D:\新建文件夹\java\linus\Linux操作\image-20230605193859932.png)

```bash
#查看当前系统名字 
uname

Linux
```

![image-20230605193944294](D:\新建文件夹\java\linus\Linux操作\image-20230605193944294.png)

```bash
##### 查看系统的位是32位还是64位
getconf LONG_BIT

64
```

![image-20230605194028867](D:\新建文件夹\java\linus\Linux操作\image-20230605194028867.png)

#### 2.关机重启

##### 1.Linux重启命令： 

1、reboot   重启

2、shutdown -r now 立刻重启(root用户使用) 

sudo reboot 

sudo shutdown -r now 

3、shutdown -r 10 过10分钟自动重启(root用户使用) 

4、shutdown -r 20:35 在时间为20:35时候重启(root用户使用)

**如果是通过shutdown命令设置重启的话，可以用shutdown -c命令取消重启**

##### 2.Linux关机命令： 

1、halt 立刻关机 

2、poweroff 立刻关机 

3、shutdown -h now 立刻关机(root用户使用) 

4、shutdown -h 10 10分钟后自动关机 

##### 3.目录操作

###### ls

```bash
#不带参数
ls

#显示所有文件包含隐藏文件
ls -all

#以MB、KB、GB为单位显示文件信息
#以MB显示
ls -all --block-size=M

#以KB显示
ls -all --block-size=K

#以GB显示
ls -all --block-size=G

#自动根据文件体积显示文件体积
ls -lah
```

命令帮助

```bash
ls --help 
用法：ls [选项] ... [文件] ...
列出有关FILE的信息（默认为当前目录）。
如果未指定-cftuvSUX和--sort，则按字母顺序对条目进行排序。

长选项的强制性参数对于短选项也是必需的。
  -a，--all不隐藏任何以.开始的项目
  -A，-几乎全部列出除.及..以外的任何项目
      --author与-l同时使用时列出每个文件的作者
  -b，--escape以八进制重叠序列表示不可打印的字符
      --block-size = SIZE缩放大小，按SIZE进行打印；例如。，
                               '--block-size = M'打印尺寸为
                               1,048,576字节；请参阅下面的SIZE格式
  -B，-ignore-backups不列出以〜结尾的隐含条目
  -c和-lt：按并显示ctime（最后一次时间）
                               修改文件状态信息）；
                               使用-l：显示ctime并按名称排序；
                               否则：按ctime排序，最新的优先
  -C按列列出条目
      --color [= WHEN]为输出着色；什么时候可以“从不”，“自动”
                               或“始终”（默认）；下面的更多信息
  -d，--directory列出目录本身，而不是目录内容
  -D，--dired生成为Emacs的转向模式设计的输出
  -f不排序，启用-aU，禁用-ls --color
  -F，-将附加指示符（* / => @ |之一）分类到条目
      --file-type一样，除了不附加'*'
      --format =横跨-x，逗号-m，水平-x，长-l，
                               单列-1，详细-l，垂直-C
      --full-time类似于-l --time-style = full-iso
  -g类似-l，但不列出所有者
      --group-directories-first
                             在文件之前对目录进行分组；
                               可以使用--sort选项进行扩充，但任何
                               使用--sort = none（-U）​​禁用分组
  -G，--no-group以一个长列表的形式，不输出组名
  -h，--human-可读与-l一起，以易于阅读的格式输出文件大小
（例如1K 234M 2G）
      --si同上面类似，但是使用1000为基底而不1024
  -H，--dereference-命令行
                             遵循命令行上列出的符号链接
      --dereference-command-line-symlink-dir
                             跟随每个命令行符号链接
                               指向目录
      --hide = PATTERN不列出与shell PATTERN匹配的隐式条目
                               （被-a或-A覆盖）
      --indicator-style = WORD将带有WORD样式的指示符附加到条目名称：
                               无（默认），斜杠（-p），
                               文件类型（-文件类型），分类（-F）
  -i，--inode打印每个文件的索引号
  -I，--ignore = PATTERN不列出与shell PATTERN匹配的隐式条目
  -k，--kibibytes默认为1024字节的块以供磁盘使用
  -l使用格式格式列出信息
  -L，--dereference当显示符号链接的文件信息时，显示符号链接所指示
的对象而并非符号链接本身的信息
  -m所有项目以逗号分隔，并填满整行行宽
  -n，--numeric-uid-gid类似-l，但列出UID及GID号
  -N，--literal输出预期处理的项目名称（如不特别处理控制字符）
  -o类似-l，但不列出有关组的信息
  -p，--indicator-style = slash对目录加上表示符号“ /”
  -q，--hide-control-chars打印吗？而不是非图形字符
      --show-control-chars按原样显示非图形字符（默认为
                               除非程序是'ls'并且输出是终端）
  -Q，--quote-name将条目名称括在双引号中
      --quoting-style = WORD将引号WORD用作条目名称：
                               文字，语言环境，shell，始终为shell，c，转义
  -r，--reverse逆序排列
  -R，--recursive递归显示子目录
  -s，--size以块数形式显示每个文件分配的尺寸
  -S按文件大小排序
      --sort = WORD按WORD而不是名称排序：无（-U），大小（-S），
                               时间（-t），版本（-v），扩展名（-X）
      --time = WORD -l，将时间显示为WORD而不是默认值
                               修改时间：一次或访问或使用（-u）
                               ctime或状态（-c）；也使用指定的时间
                               作为排序键，如果--sort = time
      --time-style =带有-l的样式，使用样式STYLE显示时间：
                               全ISO，长ISO，ISO，区域设置或+ FORMAT;
                               FORMAT的解释方式类似于'date'；如果格式
                               是FORMAT1 <newline> FORMAT2，则FORMAT1适用
                               非最新文件，FORMAT2到最近文件；
                               如果STYLE带有'posix-'前缀，则为STYLE
                               仅在POSIX语言环境外生效
  -t按修饰符排序
  结冰时间，最新的优先
  -T，--tabsize = COLS假定制表符在每个COLS处而不是8个处停止
  -u和-lt：按访问时间排序并显示；
                               -l：显示访问时间并按名称排序；
                               否则：按访问时间排序
  -U不排序；按目录顺序列出条目
  -v文本中自然的（版本）数字排序
  -w，--width = COLS假定屏幕宽度而不是当前值
  -x按行而不是按列列出条目
  -X按条目扩展名的字母顺序排序
  -1每行列出一个文件

SELinux选项：

  --lcontext显示安全上下文。启用-l。线数
                             对于大多数显示器来说可能太宽了。
  -Z，--context显示安全上下文，因此适合大多数情况
                             显示。仅显示模式，用户，组，
                             安全上下文和文件名。
  --scontext仅显示安全性上下文和文件名。
      --help显示此帮助信息并退出
      --version显示版本信息并退出

SIZE是整数和可选单位（例如：10M是10 * 1024 * 1024）。单位
是K，M，G，T，P，E，Z，Y（1024的幂）或KB，MB，...（1000的幂）。

使用色彩来区分文件类型的功能已被替换，交替设置和--color = never同时插入了它。
使用--color = auto选项，只能在标准输出被连至终端时才生成颜色代码。
LS_COLORS环境变量可更改此设置，可使用dircolors命令来设置。


退出状态：
 0正常
 1个一般问题（例如：无法访问子文件夹）
 2严重问题（例如：无法使用命令行参数）

GNU coreutils联机帮助：<http://www.gnu.org/software/coreutils/>
请向<http://translationproject.org/team/zh_CN.html>报告ls的翻译错误
要获取完整文档，请运行：info coreutils'ls invocation'

```



###### rm -rf

语法

```bash
rm [options] name...
```

**参数**：

- -i 删除前逐一询问确认。

- -f 强制删除，无需逐一确认。

- -r 将目录及以下之档案亦逐一删除。

**mkdir  创建文件夹**

-p: 确保目录名称存在，不存在的就创建一个

示例：

```bash
mkdir BB
mkdir -p BB/by   #在BB里面创建一个by的子文件 如果存在直接创建不存在就是新建一个
```

删除文件可以直接使用rm命令，若删除目录则必须配合选项"-r"，例如：

```bash
# rm  a1.java
  
# rm  AA  
 rm: #无法删除目录"AA": 是一个目录  
# rm  -r  AA  
```

![image-20230605194853382](D:\新建文件夹\java\linus\Linux操作\image-20230605194853382.png)

删除当前目录下的所有文件及目录，命令行为：

```bash
rm  -r  * 
```

![image-20230605195025667](D:\新建文件夹\java\linus\Linux操作\image-20230605195025667.png)

文件一旦通过rm命令删除，则无法恢复，所以必须格外小心地使用该命令。

###### 4.拷贝移动命令 cp

```
作用: 用于复制文件或目录
语法: cp [-r] source dest

说明: 
	-r: 如果复制的是目录需要使用此选项，此时将复制该目录下所有的子目录和文件

举例: 
    cp a3.java BB/            将a3.java复制到BB目录中
    cp a3.java ./a4.java           将a3.java复制到当前目录，并改名为a4.java
    cp -r BB/ ./by/    	将BB目录和目录下所有文件复制到by目录下
    cp -r BB/* ./CC/ 	 	将BB目录下所有文件复制到CC目录下
```

![image-20230605195510659](D:\新建文件夹\java\linus\Linux操作\image-20230605195510659.png)

##### 5.**mv** 移动

```TEXT
作用: 为文件或目录改名、或将文件或目录移动到其它位置
语法: mv source dest

举例: 
    mv a4.java a5.java                 将a4.java改名为a5.java
    mv a5.java CC/                  将文件 a5.java移动到CC目录中
    mv a3.java by/a7.java  		将 a3.java移动到by目录中，并改名为 a7.java
    mv BB/ CC/                 如果BB目录存在，将BB目录移动到CC目录中
```

![image-20230605200951799](D:\新建文件夹\java\linus\Linux操作\image-20230605200951799.png)

###### 6.剪切，粘贴操作

```bash
mv jdk-18.0.1/ /usr/local/ 
mv /usr/local/jdk-18.0.1/ . 
mv jdk18 jdk-18 
```

## 四、文件操作 

### grep [OPTIONS] PATTERN [FILE...] 

--color=auto 对匹配到的文本着色显示 

-v 显示不被pattern匹配到的行 

-i 忽略字符大小写 

-n 显示匹配的行号 

-c 统计匹配的行数 

-o 仅显示匹配到的字符串 

-q 静默模式，不输出任何信息 

-A # after, 后#行 

-B # before, 前#行 

-C # context, 前后各#行 

-e 实现多个选项间的逻辑or关系 

grep –e ‘cat ’ -e ‘dog’ file 

-w 匹配整个单词



准备abc.java文件，内容如下：

![image-20230607111015699](D:\新建文件夹\java\linus\Linux操作\image-20230607111015699.png)

​	grep语法  grep -i “要查的名字”  查询的文件

1)   grep -i "bai" abc.java  搜索出含有“bai” 字符串（-i:不区分大小）

2)   grep -i -n "bai"  abc.java  搜索出含有“bai” 字符串,并打印行号

3)    grep -i -n --color "bai"  abc.java  搜索出含有“bai” 字符串,并打印行号，关键字“bai”颜色标记（centos7系统默认为grep命令配置了别名，所以不使用—color也能显示颜色）

4)   grep -i -c "bai"  abc.java，打印“bai”字符串（不区分大小写）显示的次数

5)   grep -i -o "bai"  abc.java，打印“bai”字符串（不区分大小写），但不打印整行

![image-20230607111351373](D:\新建文件夹\java\linus\Linux操作\image-20230607111351373.png)

bcd.txt文件内容如下:

![image-20230607112016601](D:\新建文件夹\java\linus\Linux操作\image-20230607112016601.png)

6)  grep -A1 “18” bcd.txt,打印“18”字符串和它下一行的信息

7)   grep -B1 “18” bcd.txt,打印“18”字符串和它上一行的信息

8. grep -C1 “18” bcd.txt,打印“18”字符串和它上一行和下一行的信息

   ![image-20230607112411742](D:\新建文件夹\java\linus\Linux操作\image-20230607112411742.png)



​	9.grep -v "du"abc.java，匹配出不包含“du”字符串的行

​	10.grep -e 'du' -e 'bai' abc.java，同时显示匹配”du”或”bai”字符串

![image-20230607114942781](D:\新建文件夹\java\linus\Linux操作\image-20230607114942781.png)

```bash
cat by.java |grep '姓名'  #只显示姓名的数据
cat hello.java |grep 'o'  #会把包含o的所有数据都显示出来 区分大小写
```

## nl

`nl`命令在`Linux`系统中用来计算文件的行号,是 number of lines 的缩写。`nl`可以将输出的文件自动加上行号！其默认的结果与`cat -n`有点不太一样,`nl`可以自定义行号显示效果,包括位数和自动补全0

命令格式

nl [选项]... [文件]...

命令参数

> 绿框标注的就是显示栏,默认占6位。

-b a 无论是否是空行都列出行号

```bash
nl -b a input.txt
```

-b t 空行不列出行号(默认)。

-n ln 行号在显示栏的最左边显示。

-n rn 行号在显示栏的最右边显示,不填充0。

```bash
nl -b a -n rn input.txt
```

-n rz 行号在显示栏的最右边显示(默认)。

**行号前面填充0**

```bash
nl -b a -n rz input.txt
```

-w 行号显示栏占用的位数,(默认是6位)。

**行号显示栏占3位,并且填充0**

```bash
nl -b a -n rz -w 3 input.txt
```

-p 在逻辑定界符处不重新开始计算:  结束定义 封闭符的意思

- 比如字符 a，就需要用单引号做定界符 'a'；  
- 比如字符串 abc,就需要用双引号做定界符 "abc"。 
   就是 告诉计算机：
   字符开始了a字符结束了。 
   字符串开始了abc字符串结束了。 

## more

```
作用: 以分页的形式显示文件内容
语法: more fileName

操作说明:
    回车键 	向下滚动一行
    空格键 	向下滚动一屏
    b 		返回上一屏
    q或者Ctrl+C	退出more
	
举例：
	more /etc/profile		以分页方式显示/etc目录下的profile文件内容
```



## less

`less`和`more`类似,但是使用`less`可以随意浏览文件,而`more`仅能向前移动,却不能向后移动,`more`启动时会加载整个文件。而且`less`在查看之前不会加载整个文件。

## head  

head 命令可以将一段文本的开头一部分输出到标准输出。

示例：

```bash
head input.txt
```

当有多个文件输入时，head会顺序处理并输出：

```bash
head input1.txt input2.txt
```

处理标准输入

```bash
ls | head
#当没有其他参数时，head默认输出前10行，当然，head有各种参数
```

参数说明：

-n: 输出的行数

```bash
head -n 5 input.txt  #输出前5条数据
head -5 input.txt   #可以省略-n
```

**tail**

将一段文本的结尾一部分输出到标准输出，也就是从倒数第N个位置开始输出。

默认是读取：后10行的内容

```bash
tail 1.txt		#显示/etc目录下的profile文件末尾10行的内容
tail -3 1.txt	#显示/etc目录下的profile文件末尾3行的内容
```

参数：

-f : 动态读取文件末尾内容并显示，通常用于日志文件的内容输出

```bash
tail -f beiyou/my.log  #动态读取my.log末尾数据
```



## sed修改文件

比如在input.txt文件第四行添加一行，并将结果输出：

```bash
 sed -e 4a\newinput input.txt 
```

将 **testfile** 的内容列出并且列印行号，同时，请将第 2~5 行删除！

```bash
nl input.txt  | sed '2,5d'
```

sed 的动作为 2,5d，那个 **d** 是删除的意思，因为删除了 2-5 行，所以显示的数据就没有 2-5 行了

**删除从第4行到最后一行**

```bash
nl input.txt  | sed '3,$d' 
```

## 五、文件目录查找命令

## find 

语法：

```bash
find [path] [expression]
```

**参数说明** :

**path** 是要查找的目录路径，可以是一个目录或文件名，也可以是多个路径，多个路径之间用空格分隔，如果未指定路径，则默认为当前目录。

**expression** 是可选参数，用于指定查找的条件，可以是文件名、文件类型、文件大小等等

```bash
find / -name 1.txt
find / -name my.log
find ./ -name '*.txt'  #模糊查询

# 根据文件大小查找，查找大小等于2M的文件 
find ./ -size 2M 

# 根据文件大小查找，查找大小等于1k的文件
find ./ -size 1k

#根据文件大小查找，查找大小大于2M的文件 
find ./ -size +2M 

# 根据文件大小查找，查找大小在2M到5M范围的文件 
find ./ -size +2M -size -5M 

```

![image-20230606143914634](D:\新建文件夹\java\linus\Linux操作\image-20230606143914634.png)

## 六、安装nginx

nginx(engine x)是一个高性能的http和反向代理web服务器，提供了IMAP/POP3/SMTP服务

![image-20230606151735277](D:\新建文件夹\java\linus\Linux操作\image-20230606151735277.png)

反向代理服务器

![image-20230606151826350](D:\新建文件夹\java\linus\Linux操作\image-20230606151826350.png)

搜索nginx的安装包是否存在：

```bash
yum search nginx    #搜索一下
yum list | grep nginx #过滤搜索
```

![image-20230606165548782](D:\新建文件夹\java\linus\Linux操作\image-20230606165548782.png)

发现没有，需要安装一个epel源：

因为没有nginx安装包，所以我们需要安装一个yum源

```bash
yum install epel-release
```

![image-20230606152141906](D:\新建文件夹\java\linus\Linux操作\image-20230606152141906.png)

![image-20230606152157603](D:\新建文件夹\java\linus\Linux操作\image-20230606152157603.png)

安装nginx

```bash
yum insatll nginx
```

![image-20230606152408507](D:\新建文件夹\java\linus\Linux操作\image-20230606152408507.png)

![image-20230606152548128](D:\新建文件夹\java\linus\Linux操作\image-20230606152548128.png)

装完之后并知道安装到了哪里？

```bash
whereis nginx   #查找安装的目录
```

![image-20230606163208597](D:\新建文件夹\java\linus\Linux操作\image-20230606163208597.png)

etc文件夹： 所有的软件配置都在这个文件夹里面 包括网络和内核配置

运行nginx：

```bash
#进入sbin目录
cd /usr/sbin
ls
./nginx     #运行nginx
```

![image-20230606163400278](D:\新建文件夹\java\linus\Linux操作\image-20230606163400278.png)

验证80端口是否启动：

```bash
netstat -ano |grep 80
netstat -anp |grep 80   
#查看是哪个进程使用
```

![image-20230606164859211](D:\新建文件夹\java\linus\Linux操作\image-20230606164859211.png)

使用curl 执行nginx查看是否能进入：

```bash
curl http://127.0.0.1:80
```

![image-20230606164535404](D:\新建文件夹\java\linus\Linux操作\image-20230606164535404.png)

也可以在外部访问：

```bash
#ip号：80 即可
#防火墙开的情况下是没法访问的 关闭防火墙即可
systemctl stop firewalld
```

![image-20230606164600461](D:\新建文件夹\java\linus\Linux操作\image-20230606164600461.png)

在网页中输入IP地址即可http://192.168.14.180/

![image-20230606164710586](D:\新建文件夹\java\linus\Linux操作\image-20230606164710586.png)

## 七、防火墙的开启、关闭、禁用命令

（1）设置开机启用防火墙：systemctl enable firewalld

（2）设置开机禁用防火墙：systemctl disable firewalld

（3）启动防火墙：systemctl start firewalld

（4）关闭防火墙：systemctl stop firewalld 或systemctl stop firewalld.service

（5）检查防火墙状态`systemctl status firewalld`

### 使用firewall-cmd配置端口

（1）查看防火墙状态：firewall-cmd --**state**

（2）重新加载配置：firewall-cmd --reload

（3）查看开放的端口：firewall-cmd --list-ports

（4）开启防火墙端口：firewall-cmd --zone=public --add-port=9200/tcp --permanent

> 命令含义：

> –zone #作用域

> –add-port=9200/tcp #添加端口，格式为：端口/通讯协议

> –permanent #永久生效，没有此参数重启后失效

> 注意：添加端口后，必须用命令firewall-cmd --reload重新加载一遍才会生效

（5）关闭防火墙端口：firewall-cmd --zone=public --remove-port=9200/tcp --permanent

## 八、 Top

top命令是Linux下常用的性能分析工具，能够实时显示系统中各个进程的资源占用状况，类似于Windows的任务管理器。

```bash
top
```

你也可以在命令启动时，直接对top加参数。比如以cpu使用情况排序

```bash
top -o %CPU
```

![image-20230607091501936](D:\新建文件夹\java\linus\Linux操作\image-20230607091501936.png)

**线程运行情况:**

top命令默认显示的进程的运行情况，在top命令执行后，按大写的H，可进入线程执行情况页面，再按一次H则会到进程展示。或者在启动时对top加参数`top -H`

```bash
top -H #或在输入后 输入 H
```

![image-20230607093501016](D:\新建文件夹\java\linus\Linux操作\image-20230607093501016.png)

**树形结构展示父子进程关系**

top执行后按大V

**基于用户过滤进程**

在top启动后，按小写u，在输入框中输入对应的用户名

或者在top启动时，通过加参数来过滤用户`top -u root`

```bash
top -u nginx
```

![image-20230607094339842](D:\新建文件夹\java\linus\Linux操作\image-20230607094339842.png)

**通过指定监控进程ID 查看**

```bash
top -p PID

#示例：
netstat -anp |grep 80
top -p 1246
```

![image-20230607093922506](D:\新建文件夹\java\linus\Linux操作\image-20230607093922506.png)

```bash
top -H -p 1246
```

![image-20230607094159989](D:\新建文件夹\java\linus\Linux操作\image-20230607094159989.png)



### 1.如何基于进程id，或程序名来查看其资源占用情况

首先基于`ps aux | grep processName` 找到对应进程的pid 然后使用`top -c -p pid`方式单过滤查看该进程的资源占用情况

```bash
ps aux | grep processName    #找到对应的进程pid
top -c -p pid                #单独显示进程
```

![image-20230607093952852](D:\新建文件夹\java\linus\Linux操作\image-20230607093952852.png)

### 2.进程查看ps 

ps 命令是最常用的监控进程的命令，这个命令可以查看系统中所有运行进程的详细信息

```bash
ps -ef | grep nginx #查看系统进程

ps aux #可以查看系统中所有的进程；

ps -le #可以查看系统中所有的进程，而且还能看到进程的父进程的 PID 和进程优先级；

ps -l #只能看到当前 Shell 产生的进程；
```

![image-20230607094745338](D:\新建文件夹\java\linus\Linux操作\image-20230607094745338.png)

```bash
ps axjf
```

![image-20230607095144575](D:\新建文件夹\java\linus\Linux操作\image-20230607095144575.png)

### 3.杀死进程程序注意：

**该命令可以使用-9参数来强制杀死进程**

```bash
kill  -9  pid
kill  -9  1245
#示例： 删除nginx工作线程
ps aux | grep nginx   #查找
kill -9 1246   #删除还会在出来的
#当你把主的删除后，ng会自动选者另一个子节点当主节点
```

![image-20230607102505544](D:\新建文件夹\java\linus\Linux操作\image-20230607102505544.png)

再次启动nginx

![image-20230607102628866](D:\新建文件夹\java\linus\Linux操作\image-20230607102628866.png)

### 4. netstat查看端口占用

端口号查看netstat

```bash
netstat -ano |grep 80
netstat -anp |grep 80
```

**telnet 测试应用端口是否开放**

说明：在开发中发现调用别人的接口端口的时候没有调通，一般都会先检查一下ip能不能进入。

```cmd
window： telnet 192.168.14.180 80   #如果能进入证明没有问题
```

如果无法使用的话就开启一下：

![image-20230607095906564](D:\新建文件夹\java\linus\Linux操作\image-20230607095906564.png)

![image-20230607095942830](D:\新建文件夹\java\linus\Linux操作\image-20230607095942830.png)

### 5. 内存查看情况free

```bash
free  #默认单位实kb
free -m #以M为单位
free -g #是以G为单位
```

有时我们需要持续的观察内存的状况，此时可以使用 -s 选项并指定间隔的秒数：

```bash
 free -h -s 3
```

![image-20230607102738068](D:\新建文件夹\java\linus\Linux操作\image-20230607102738068.png)

### 6. fdisk

fdisk 是一个创建和维护分区表的程序，它兼容 DOS 类型的分区表、BSD 或者 SUN 类型的磁盘列表

必要参数：

-l 列出素所有分区表

-u 与-l 搭配使用，显示分区数目

示例：

```bash
fdisk -l   #显示当前分区情况：
```

![image-20230607102818875](D:\新建文件夹\java\linus\Linux操作\image-20230607102818875.png)

```bash
fdisk -lu  #显示SCSI硬盘的每个分区情况
```

![image-20230607102935343](D:\新建文件夹\java\linus\Linux操作\image-20230607102935343.png)

```bash
df -h #查看磁盘占用情况
```

![image-20230607104030708](D:\新建文件夹\java\linus\Linux操作\image-20230607104030708.png)
