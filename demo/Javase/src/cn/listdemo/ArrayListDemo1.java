/*
 * Copyright (c) 2017, 2023, zxy.cn All rights reserved.
 *
 */
package cn.listdemo;

import java.util.ArrayList;

/**
 * <p>Description:</p>
 * <p>Class:</p>
 * <p>Powered by zxy On 2023/6/10 9:43 </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class ArrayListDemo1 {
    public static void main(String[] args) {
        //1.创建集合的对象
        //泛型：限定集合中存储数据的类型
//        ArrayList<String> list = new ArrayList<>();
        //JDK7:

        //此时我们创建的是ArrayList 的对象，而ArrayList 是java已经写好的一个类
        //这个类在底层做了一些处理
        //打印对象不是地址值，而是集合中存储数据内存
        //在展示的时候会拿[] 把所有的数据进行包裹
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);
    }

}
