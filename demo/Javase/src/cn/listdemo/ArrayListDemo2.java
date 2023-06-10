/*
 * Copyright (c) 2017, 2023, zxy.cn All rights reserved.
 *
 */
package cn.listdemo;

import java.util.ArrayList;

/**
 * <p>Description:</p>
 * <p>Class:
 * boolean add(E e) 添加
 * boolean remove(E e) 删除
 * E remove(int index)
 * E set(int index,E e) 修改
 * E get(int index) 查询
 * int size() 获取长度
 * </p>
 * <p>Powered by zxy On 2023/6/10 9:57 </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class ArrayListDemo2 {
    public static void main(String[] args) {
        //1.创建一个集合
        ArrayList<String> list = new ArrayList<>();
        //2.添加元素
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        //3.删除元素
//        boolean result1 = list.remove("aaa");
//        System.out.println(result1);
//
//        boolean result2 = list.remove("eee");
//        System.out.println(result2);
//
//        String str = list.remove(2);
//        System.out.println(str);

        //修改元素
        String result = list.set(1, "fff");
        System.out.println(result);

        //查询元素
        String s = list.get(0);
        System.out.println(s);

        //遍历
        for (int i = 0; i < list.size(); i++) {
            //i 索引
            //list.get(i) 元素
            String str = list.get(i);
            System.out.println(str);
        }
        System.out.println(list);
    }
}
