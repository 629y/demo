package cn.practice3;

import java.util.Arrays;

public class Regexp3 {
    public static void main(String[] args) {
        String str = "hello16java16mysql8html";
        System.out.println(str);//hello16java16mysql8html

        //删除指定的数字
        System.out.println(str.replace("6", ""));//hello1java1mysql8html

        //删除所有数字
        for (int i = 0; i <= 9; i++) {
            str = str.replace(String.valueOf(i), "");
        }
        System.out.println(str);//hellojavamysqlhtml

        //------------使用正则表达式，删除所有数字
        String str2 = "hello16789java16mysql8html";
        System.out.println(str2);//hello16789java16mysql8html

        //这两个方法，支持正则表达式 \\d 代表数字   \\D 代表非数字
        //String.replaceAll()  String.replaceFirst();
        System.out.println(str2.replaceAll("\\d", ""));//删除字符串数字内容
        //hellojavamysqlhtml
        System.out.println(str2.replaceAll("\\D", ""));//删除不是数字的内容
        //16789168

        //删除首次出现的字符串匹配删除 \\d+
        System.out.println(str2.replaceFirst("\\d+", ""));//hellojava16mysql8html

        String[] langs = str2.split("\\d+");
        System.out.println(Arrays.toString(langs));//[hello, java, mysql, html]
    }
}
