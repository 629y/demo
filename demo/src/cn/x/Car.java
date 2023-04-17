/*
 * Copyright (c) 2017, 2023, zxy.cn All rights reserved.
 *
 */
package cn.x;

/**
 * <p>Description:</p>
 * <p>Class:</p>
 * <p>Powered by zxy On 2023/4/17 21:12 </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */

public class Car {

    private String name;

    public void text(){

    }

    public static void text2(){

    }
    public static void main(String[] args) {
        Car car = new Car();
        car.text();
        text2();
        car.name = "";
//        Book book = new Book();
        Book book = car.new Book();

    }

     class Book{

    }
}
