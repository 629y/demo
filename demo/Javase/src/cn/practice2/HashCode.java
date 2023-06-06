/*
 * Copyright (c) 2017, 2023, zxy.cn All rights reserved.
 *
 */
package cn.practice2;

/**
 * <p>Description:</p>
 * <p>Class:</p>
 * <p>Powered by zxy On 2023/5/16 20:29 </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class HashCode {
    public static void main(String[] args) {
        System.out.println("Ma".hashCode());//2484
        System.out.println("NB".hashCode());//2484
        String s1 = new String("Ma");
        String s2 = new String("NB");
        System.out.println(s1.hashCode()); //2484
        System.out.println(s2.hashCode()); //2484
    }
}