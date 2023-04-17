/*
 * Copyright (c) 2017, 2023, zxy.cn All rights reserved.
 *
 */
package org.practice;

/**
 * <p>Description:方法名称 形参列表 形参列表个数不确定</p>
 * <p>Class:</p>
 * <p>Powered by zxy On 2023/4/17 21:53 </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class User {
    /*编写一个方法，要求形参个数不确定 参数使用数组 int[] ...*/
    public int mysum(int[] ns) {
        int s = 0;
        for (int t : ns) {
            s += t;
        }
        return s;
    }

    public int mys(int... n) {
        return mysum(n);
    }

    public static void main(String[] args) {
        //调用
        User u = new User();
        System.out.println(u.mysum(new int[]{}));//0
        System.out.println(u.mysum(new int[]{1, 2, 3}));//6
        System.out.println(u.mysum(new int[]{1, 6, 10, 2, 3}));//22
        System.out.println(u.mys(1, 6, 10, 5, 2, -5, 9, 20, 10, -28));//30
        System.out.println(u.mys());//0

        int[] a = {10,20,30};
        System.out.println(a.length);//3
    }
}