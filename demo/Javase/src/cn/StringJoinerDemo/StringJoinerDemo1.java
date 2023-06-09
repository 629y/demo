/*
 * Copyright (c) 2017, 2023, zxy.cn All rights reserved.
 *
 */
package cn.StringJoinerDemo;

import java.util.StringJoiner;

/**
 * <p>Description:</p>
 * <p>Class:</p>
 * <p>Powered by zxy On 2023/6/9 20:18 </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class StringJoinerDemo1 {
    public static void main(String[] args) {
        //1.创建一个对象，并指定中间的间隔符号
        StringJoiner sj = new StringJoiner("---");
        //2.添加元素
        sj.add("aaa").add("bbb").add("ccc");
        //3.打印结果
        System.out.println(sj);//aaa---bbb---ccc

    }
}
