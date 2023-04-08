package cn.practice;

import java.util.Date;

public class StruDate {
    public static void main(String[] args) {
        Date date1 = new Date(); // 调用无参数构造函数
        System.out.println(date1.toString()); // 输出：Fri Feb 10 21:24:05 CST 2023
        Date date2 = new Date(60000); // 调用含有一个long类型参数的构造函数
        System.out.println(date2); // 输出：Thu Jan 01 08:01:00 CST 1970
    }
}
