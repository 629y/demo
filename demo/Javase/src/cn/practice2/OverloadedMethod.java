/*
 * Copyright (c) 2017, 2023, zxy.cn All rights reserved.
 *
 */
package cn.practice2;

import static java.lang.Math.random;
import static java.lang.Math.round;

/**
 * <p>Description:重载方法-在一个类，或多个继承关系类中，存在方法名称一样，方法参数不一样，
 * 此类方法重载方法。构造方法重载</p>
 * <p>Class:OverloadedMethod</p>
 * <p>Powered by zxy On 2023/4/18 0:44 </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class OverloadedMethod {
    static int sum() {
        return 0;
    }
    static int sum(int a, int b) {
        return a + b;
    }
    static double sum(float a, float b) {
        return a + b;
    }
    static double sum(double a, double b) {
        return a + b;
    }
    public static void show() {
        System.out.println("show...");

        //使用静态导入
        System.out.println(random());
        System.out.println(Math.random());
        System.out.println(round(1.5));
    }
}
