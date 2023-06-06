/*
 * Copyright (c) 2017, 2023, zxy.cn All rights reserved.
 *
 */
package cn.practice2;

/**
 * <p>Description:1.3 extends类的继承</p>
 * <p>Class:A</p>
 * <p>Powered by zxy On 2023/5/15 21:47 </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */

public class A {
    public A(int i){
        System.out.println("父类构造A(int i)");
    }

    static {
        System.out.println("父类static{}");
    }

    {
        System.out.println("父类init{}");
    }
    public int square(int i){
        System.out.println("Parent...square(int i)");
        return i*i;
    }

}

