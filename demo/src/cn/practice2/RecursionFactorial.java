/*
 * Copyright (c) 2017, 2023, zxy.cn All rights reserved.
 *
 */
package cn.practice2;

/**
 * <p>Description:递归方法-输出阶乘-4！</p>
 * <p>Class:RecursionFactorial</p>
 * <p>Powered by zxy On 2023/4/18 0:38 </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class RecursionFactorial {
    public static void main(String[] args) {
        //factorial() static
        //System.out.println(factorial(3));
        var d = new  RecursionFactorial();
        System.out.println(d.factorial(4));
    }
    int factorial(int n) {
        if (n > 1) {
            return n * factorial(n - 1);
        }
        return 1;
    }
}
