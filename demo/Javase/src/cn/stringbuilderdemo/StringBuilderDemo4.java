/*
 * Copyright (c) 2017, 2023, zxy.cn All rights reserved.
 *
 */
package cn.stringbuilderdemo;

/**
 * <p>Description:</p>
 * <p>Class:</p>
 * <p>Powered by zxy On 2023/6/8 21:54 </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class StringBuilderDemo4 {
    public static void main(String[] args) {
        //1.创建对象
        StringBuilder sb = new StringBuilder();
        //2.添加字符串
        sb.append("aaa");
        sb.append("bbb");
        sb.append("ccc");
        sb.append("ddd");
        System.out.println(sb);//aaabbbcccddd
        //3.再把StringBuilder变回字符串
        String str = sb.toString();
        System.out.println(str);//aaabbbcccddd
    }
}
