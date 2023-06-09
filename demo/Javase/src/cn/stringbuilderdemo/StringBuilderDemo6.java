/*
 * Copyright (c) 2017, 2023, zxy.cn All rights reserved.
 *
 */
package cn.stringbuilderdemo;

import java.util.Scanner;

/**
 * <p>Description:对称字符串 案例
 * 要求：键盘接收一个字符串，程序判断出该字符串是否是对称字符串，并在控制台打印是或不是
 * 对称字符串：123321、111
 * 非对称字符串：123123</p>
 * <p>Class:</p>
 * <p>Powered by zxy On 2023/6/9 19:55 </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class StringBuilderDemo6 {
    //使用StringBuilder的场景：
    //1.字符串的拼接
    //2.字符串的反转
    public static void main(String[] args) {
        //1.键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();
        //2.反转键盘录入的字符串
        String result = new StringBuilder().append(str).reverse().toString();
        //3.比较
        if (str.equals(result)){
            System.out.println("当前字符串是对称字符串");
        }else {
            System.out.println("当前字符串不是对称字符串");
        }
    }
}
