package cn.practice3;

public class StrApi {
    public static void main(String[] args) {
        String str = "Java";
//        System.out.println(str.repeat(-2));// 小于0：java.lang.IllegalArgumentException

        System.out.println(str.repeat(0)); // 等于0：空白串（""）

        System.out.println(str.repeat(3));//JavaJavaJava

//        System.out.println(str.repeat(Integer.MAX_VALUE));// java.lang.OutOfMemoryError

        System.out.println("A\nB\nC\rD".lines().count());// 4

        String s1 = " hello java 1.8 ";
        System.out.println(s1);// hello java 1.8

        //.concat() 方法相当于 + 属性字符串连接
        System.out.println("hello".concat(" ".repeat(30)).concat("java19"));//hello                              java19
        System.out.println("hello" + "\s".repeat(30) + "java19");//hello                              java19
        //\s  相当于空格  现在不推荐使用

        //清除首尾连续空格
        System.out.println(s1.trim());//hello java 1.8
        System.out.println(s1.strip());
        System.out.println(s1.stripLeading());
        System.out.println(s1.stripTrailing());

        //清除所有空格
        System.out.println(s1.replace(" ",""));
        System.out.println("------------");
        System.out.println("".isBlank());
        System.out.println("".isEmpty());
        System.out.println(" ".isBlank());//true
        System.out.println(" ".isEmpty());//false
        System.out.println(" ".trim().length() == 0 ? "空字符串" : "正确");
        System.out.println(" ".isBlank() ? "空字符串" : "正确");
        System.out.println("*".repeat(60));
        System.out.println("------------");

        //求字符串中行数
        System.out.println("hello\njava\nok\n123\nmysql");
        System.out.println("hello\njava\nok\n123\nmysql".lines().count());
    }
}
