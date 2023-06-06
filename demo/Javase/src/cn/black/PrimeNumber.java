/*
 * Copyright (c) 2017, 2023, zxy.cn All rights reserved.
 *
 */
package cn.black;

/**
 * <p>Description:打印素数（质数）</p>
 * 判断101~200 之间有多少个素数，并打印所有素数
 * 素数又称为质数，是指在大于1的自然数中，除了1和它本身以外，不再有其他因数的自然数
 * <p>Class:PrimeNumber</p>
 * <p>Powered by zxy On 2023/5/31 17:09 </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class PrimeNumber {
    //思路：2~99
    //定义变量i，赋值100
    //判断i是否为质数
    public static void main(String[] args) {
        //定义一个变量用来统计有多少个质数
        int count = 0;
        //外循环：遍历101~200 这个范围，依次得到这个范围之内的每一个数字
        for (int i = 101; i <= 200; i++) {
            //i 依次表示循环中的每一个数字
            //继续判断 i 是否为一个质数
            boolean flag = true;
            //内循环：判断当前数字是否为一个质数
            for (int j = 2; j < i; j++) {
                //j 表示2~99之间的每一个数字
                if (i%j == 0){
                    flag = false;
                    //跳出单层循环，内循环
                    break;
                }
            }
            if (flag){
                System.out.println("当前数字"+ i + "是质数");
                count++;
            }
        }
        System.out.println("一共有" + count + "个质数");
    }
}
