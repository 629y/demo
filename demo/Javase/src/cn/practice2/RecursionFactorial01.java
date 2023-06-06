/*
 * Copyright (c) 2017, 2023, zxy.cn All rights reserved.
 *
 */
package cn.practice2;

/**
 * <p>Description:递归方法-4！-5！(另外一种方法)-递归排序输出</p>
 * <p>Class:</p>
 * <p>Powered by zxy On 2023/4/18 0:41 </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class RecursionFactorial01 {
    public static void main(String[] args) {
        //factorial() static
        //System.out.println(factorial(3));
        var d = new  RecursionFactorial();
        System.out.println(d.factorial(4));//24

        int js = 1;
        for (int i = 2; i < 6; i++) {
            js *= i;
        }
        System.out.println("!5 = " + js);//!5 = 120
        m1(6);//6 5 4 3 2 1
        m2(6);//1 2 3 4 5 6
    }
    static void m1(int n) {
        System.out.println(n);
        if (n > 1) m1(n - 1);
    }
    static void m2(int n) {
        if (n > 1) {
            m2(n - 1);
        }
        System.out.println(n);
    }

    int factorial(int n) {
        if (n > 1) {
            return n * factorial(n - 1);
        }
        return 1;
    }
}
