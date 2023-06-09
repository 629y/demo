/*
 * Copyright (c) 2017, 2023, zxy.cn All rights reserved.
 *
 */
package cn.str;

/**
 * <p>Description:</p>
 * <p>Class:</p>
 * <p>Powered by zxy On 2023/6/9 20:48 </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class test1 {
    public static void main(String[] args) {
        String s1 = "abc";//记录串池中的地址值
        String s2 = "a" + "b" + "c";//复用串池中的字符串
        System.out.println(s1 == s2);//true
    }
}
