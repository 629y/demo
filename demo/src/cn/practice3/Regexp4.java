package cn.practice3;

public class Regexp4 {
    public static void main(String[] args) {
        //判断字符串有没有大写
        String str = "hello";
        //.*[A-Z].*
        // .代表一个任意符号
        if (str.matches("^.*[A-Z].*$")) {
            System.out.println(String.format("%s:有大写字母", str));
        } else {
            System.err.println(String.format("%s:没有大写字母", str));
        }

        // 判断字符串有没有数字
        System.out.println("hello".matches("^.*\\d.*$"));

        //判断有没有汉字
        System.out.println("china".matches("^.*[\u4e00-\u9fa5].*$"));

        // 判断是不是手机号
        String phone = "13014577066";
        String pattern = "^1[358]\\d{9}$";
        if (phone.matches(pattern)) {
            System.out.println("yes");
        } else {
            System.out.printf("手机号：%s不是合法的手机号。 \n", phone);
        }

        // 判断是不是纯中文
        String name = "jack";
        String p = "^[\u4e00-\u9fa5]+$";
        if (name.matches(p)) {
            System.out.println(name);
        } else {
            System.out.println("姓名必须为纯中文");
        }

        String str1 = "他的手机号是：13014577033，他在郑州。";
        System.out.println(str1.matches(".*\\d.*"));
        //判断str是不是标准的手机号格式
        System.out.println(str1.matches("1[358]\\d{9}"));
        //判断字符串有没有手机号
        System.out.println(str1.matches(".*1[358]\\d{9}.*"));

        //是不是中文是不是一个汉字 ^开头 $代表结尾   {1}
        System.out.println("中文".matches("^[\u4e00-\u9fa5]$"));//false
        //+ {,}
        System.out.println("中文".matches("^[\u4e00-\u9fa5]+$"));//true
        System.out.println("中文".matches("[\u4e00-\u9fa5]+"));//true
        System.out.println("--".repeat(20));
        //* 代表是 {0,}
        System.out.println("中文a".matches("[\u4e00-\u9fa5]*"));//false
        System.out.println("".matches("[\u4e00-\u9fa5]*"));//true
        // ? {0,1}
        System.out.println("中".matches("[\u4e00-\u9fa5]?"));//true
        System.out.println("中文".matches("[\u4e00-\u9fa5]{2,6}"));//true
        System.out.println("**".repeat(25));
        //是不是全英文
        System.out.println("abc".matches("[a-zA-Z]+"));//true
        System.out.println("ab c".matches("[a-zA-Z]+"));//false
        System.out.println("ab123c".matches("[a-zA-Z]+"));//false
        System.out.println("abDDDc".matches("[a-zA-Z]{1,}"));//true
        System.out.println("___".repeat(20));
        //是不是全数字 "\\d+"  "\\d*"
        System.out.println("0000".matches("\\d"));//false
        System.out.println("0000".matches("\\d+"));//true
        System.out.println("0000".matches("\\d?"));//false
        System.out.println("0000".matches("\\d*"));//true
    }
}
