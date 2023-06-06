/*
 * Copyright (c) 2017, 2023, zxy.cn All rights reserved.
 *
 */
package cn.str;

/**
 * <p>Description:</p>
 * <p>Class:</p>
 * <p>Powered by zxy On 2023/6/6 17:34 </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class StringDemo1 {
    public static void main(String[] args) {
        //传递一个字符数组，根据字符数组的内容再创建一个新的字符串对象
        //需求：要修改字符串的内容 abc Qbc
        //abc -->  {'a','b','c'} --> {'Q','b','c'} --> "Qbc"
        char[] chs = {'a','b','c','d'};
        String s4 = new String(chs);
        System.out.println(s4);//abcd

        //传递一个字节数组，根据字节数组的内容再创建一个新的字符串对象
        //应用场景：在网络当中传输的数据其实都是字节信息
        //一般把字节信息进行转换，转成字符串，需要用到这个构造
        byte[] bytes = {97,98,99,100};
        String s5 = new String(bytes);
        System.out.println(s5);//abcd

    }
}
