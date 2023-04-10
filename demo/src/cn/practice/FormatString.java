package cn.practice;

public class FormatString {
    public static void main(String[] args) {
        String name = "张三丰";
        int age = 19;
        String address="河南省郑州科学大道33号";
        String str1 = "姓名：" + name + "，年龄：" + age + "岁，家庭地址：" + address + "。";
        System.out.println(str1);

        //格式化字符串
        String str2 = String.format("姓名：%s，年龄：%d岁，家庭地址：%s。",name,age,address);
        System.out.println(str2);

        //printf()格式直接输出
        System.out.printf("姓名：%s，年龄：%d岁，家庭地址：%s。",name,age,address);

        //格式化小数 float double
        double num = Math.random();
        System.out.println(num);
        System.out.printf("%.1f %<.2f %<.3f %<.4f %<.0f%n",num);
        System.out.printf("%.1f %2$.2f %1$.3f %<.4f %<.0f%n", num, 1.34245);

        //格式化日期 < %tF 2023-02-10 %tT 09:43:22
        System.out.printf("%tF %<tT %<tc%n",System.currentTimeMillis());

        //tm 月 tM 分钟 年月日 tp上午 ta星期 tb月份
        System.out.printf("%tY年%<tm月%<td日 %<tp %<tA %<ta %<tb %<tB%n",System.currentTimeMillis());

        //时分秒
        System.out.printf("%tH:%<tM:%<tS%n",System.currentTimeMillis());

        //格式化整数
        System.out.printf("%d %<05d %<5d%n", 123);
        System.out.printf("%10s %25S %<-30s%n", "java", "hello,java");
        System.out.printf("%10s", "java");
        System.out.printf("%25S%n","hello,java");
        System.out.printf("%-30s","hello,java");
        System.out.printf("%-30s","h");
        System.out.printf("%-30s%n","e");

        System.out.println("李四");
        System.out.println("李四丰");
        System.out.println("李丰");

        System.out.printf("%3s%n", "李四");
        System.out.printf("%3s%n", "李四丰");
        System.out.printf("%3s%n", "李丰");

    }
}
