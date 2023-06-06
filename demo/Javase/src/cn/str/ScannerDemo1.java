/*
 * Copyright (c) 2017, 2023, zxy.cn All rights reserved.
 *
 */
package cn.str;

import java.util.Scanner;

/**
 * <p>Description:</p>
 * <p>Class:</p>
 * <p>Powered by zxy On 2023/6/6 17:24 </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class ScannerDemo1 {
    public static void main(String[] args) {
        //1.创建对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个小数");
        //2.接收一个小数
        //ctrl + alt + v
        double result = sc.nextDouble();
        //3.输出打印
        System.out.println(result);
    }
}
