/*
 * Copyright (c) 2017, 2023, zxy.cn All rights reserved.
 *
 */
package cn.practice2;

/**
 * <p>Description:类  对象(实例对象)     new实例化对象(对象可以使用)</p>
 * <p>Class:</p>
 * <p>Powered by zxy On 2023/4/17 20:25 </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class Demo {
    public static void main(String[] args) {
        //类  对象(实例对象)     new实例化对象(对象可以使用)
        User u = new User();
        Teacher t = new Teacher();
        User.Book book = new User(). new Book();
        //User.Book book1 = u.new Book();
    }
}
