/*
 * Copyright (c) 2017, 2023, zxy.cn All rights reserved.
 *
 */
package cn.practice2;

/**
 * <p>Description:递归方法-在方法内部，再次调用本方法，此方法就是递归方法</p>
 * <p>Class:Recursion</p>
 * <p>Powered by zxy On 2023/4/18 0:34 </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class Recursion {
    static void m1(int i) {
        if (i >= 0) {
            System.out.println(i);
            m1(--i);
        }
    }
    static void m2(int i) {
        if (i >= 0) {
            m2(--i);
            System.out.printf("%d ",i+1);
        }
    }
    public static void main(String[] args) {
        System.out.println("---");//6 5 4 3 2 1 0
        m1(6);
        System.out.println("---");
        m2(6);//0 1 2 3 4 5 6
    }
}
