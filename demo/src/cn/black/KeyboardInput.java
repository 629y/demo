/*
 * Copyright (c) 2017, 2023, zxy.cn All rights reserved.
 *
 */
package cn.black;

import java.util.Scanner;

/**
 * <p>Description:键盘录入</p>
 * <p>Class:KeyboardInput</p>
 * <p>Powered by zxy On 2023/5/24 11:11 </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class KeyboardInput {
    public static void main(String[] args) {
        //第一套体系：
        //nextInt();接收整数
        //nextDouble();接收小数
        //next();接收字符串
        //遇到空格，制表符，回车就停止接收，这些符号后面的数据就不会接收了

//        Scanner sc = new Scanner(System.in);//123 456
//        System.out.println("请输入一个整数");
//        int num1 = sc.nextInt();
//        System.out.println(num1);//123
//        System.out.println("请输入第二个整数");
//        int num2 = sc.nextInt();
//        System.out.println(num2);//456

//        Scanner sc = new Scanner(System.in);//abc def
//        System.out.println("请输入一个字符串");
//        String str1 = sc.next();
//        System.out.println(str1);//abc
//        System.out.println("请输入第二个字符串");
//        String str2 = sc.next();
//        System.out.println(str2);//def

        //第二套体系：
        //nextLine();接收字符串
        //可以接收空格，制表符，遇到回车才停止接收数据

        Scanner sc = new Scanner(System.in);//abc def
        System.out.println("请输入一个字符串");
        String line1 = sc.nextLine();
        System.out.println(line1);//abc def
        System.out.println("请输入第二个字符串");
        String line2 = sc.nextLine();
        System.out.println(line2);//abc def
    }
}
