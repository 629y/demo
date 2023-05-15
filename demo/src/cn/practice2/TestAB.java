/*
 * Copyright (c) 2017, 2023, zxy.cn All rights reserved.
 *
 */
package cn.practice2;

/**
 * <p>Description:</p>
 * <p>Class:</p>
 * <p>Powered by zxy On 2023/5/15 21:54 </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */

public class TestAB {
    public static void main(String[] args) {
//        B b = new B(3);
////        System.out.println(b.square(3));
//
////        b.getNum(3);
//        System.out.println("------------");
//        B b1 = new B(6);

        C b = new C(3);
        System.out.println("------------");
        C b1 = new C(6);

        A a = new C(3);
        System.out.println("------------");
        a.square(3);

        //内部匿名类
//        AbstractClass db = new AbstractClass(){
//
//            @Override
//            public void connection() {
//
//            }
//        };

    }
}

