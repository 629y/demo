/*
 * Copyright (c) 2017, 2023, zxy.cn All rights reserved.
 *
 */
package cn.black;

/**
 * <p>Description:回文数</p>
 * 需求：给你一个整数x,如果x是一个回文整数，打印true,否则，返回false
 * 解释：回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数
 * 例如：121 是回文，而123 不是。
 * <p>Class:PalindromeNumber</p>
 * <p>Powered by zxy On 2023/5/30 15:33 </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class PalindromeNumber {
    //核心思路：把数字倒过来跟原来的数字进行比较
    public static void main(String[] args) {
        //1.定义数字
        int x = 121;
         //定义一个临时变量用于记录x原来的值，用于最后进行比较
        int temp = x;
         //记录倒过来之后的结果
        int num = 0;
        //2.利用循环开始
        while (x != 0) {//类似于递归
            //从右往左获取每一位数字
            int ge = x % 10;
            //修改一下 x 记录的值
            x = x / 10;
            //把当前获取到的数字拼接到最右边
            num = num * 10 + ge;
        }
        //打印num
        System.out.println(num);
        System.out.println(x);
        //比较
        System.out.println(num == temp);
    }
}
