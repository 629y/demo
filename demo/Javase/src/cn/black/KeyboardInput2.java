/*
 * Copyright (c) 2017, 2023, zxy.cn All rights reserved.
 *
 */
package cn.black;

import java.util.Scanner;

/**
 * <p>Description:键盘录入的两套体系不能混用的</p>
 * <p>Class:KeyboardInput2 </p>
 * <p>Powered by zxy On 2023/5/24 21:53 </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class KeyboardInput2 {
    public static void main(String[] args) {
        //键盘录入的两套体系不能混用的-弊端：先用nextInt,再用nextLine会导致下面的nextLine接收不到数据
        Scanner sc = new Scanner(System.in);//123 456
        System.out.println("请输入一个整数");
        int num = sc.nextInt();
        System.out.println(num);//123
        System.out.println("请输入一个字符串");
        String line = sc.nextLine();
        System.out.println(line);// 456
    }
}
