/*
 * Copyright (c) 2017, 2023, zxy.cn All rights reserved.
 *
 */
package cn.StringJoinerDemo;

import java.util.StringJoiner;

/**
 * <p>Description:</p>
 * <p>Class:</p>
 * <p>Powered by zxy On 2023/6/9 20:21 </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class StringJoinerDemo2 {
    public static void main(String[] args) {
        //1.创建对象
        StringJoiner sj = new StringJoiner(",", "[", "]");
        //2.添加元素
        sj.add("aaa").add("bbb").add("ccc");
        int len = sj.length();
        System.out.println(len);//13
        //3.打印结果
        System.out.println(sj);//[aaa,bbb,ccc]

        String str = sj.toString();
        System.out.println(str);//[aaa,bbb,ccc]
    }
}
