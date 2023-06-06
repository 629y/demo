/*
 * Copyright (c) 2017, 2023, zxy.cn All rights reserved.
 *
 */
package cn.x;

/**
 * <p>Description:</p>
 * <p>Class:</p>
 * <p>Powered by zxy On 2023/4/17 21:15 </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class DEmo {

    public static void main(String[] args) {
//        Car.Book book = car.new Book();

//        Car car = new Car();
//        Car.Book book = car.new Book();
        //上面两行就等于下面这一行
        Car.Book book = new Car().new Book();

    }
}
