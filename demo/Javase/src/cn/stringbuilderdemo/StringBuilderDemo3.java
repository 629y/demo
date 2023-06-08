/*
 * Copyright (c) 2017, 2023, zxy.cn All rights reserved.
 *
 */
package cn.stringbuilderdemo;

/**
 * <p>Description:
 * public StringBuilder append(任意类型)
 * public StringBuilder reverse()
 * public int length()
 * public String toString()</p>
 * <p>Class:</p>
 * <p>Powered by zxy On 2023/6/8 21:46 </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class StringBuilderDemo3 {
    public static void main(String[] args) {
        //1.创建对象
        StringBuilder sb = new StringBuilder("abc");

        //2.添加元素
        sb.append(1);
        sb.append(2.3);
        sb.append(true);
        //反转
        sb.reverse();
        //获取长度
        int len = sb.length();
        System.out.println(len);
        //打印
        //普及：
        //因为StringBuilder是Java 已经写好的类，java在底层对他做了一些特殊处理，打印对象不是地址值而是属性值
        System.out.println(sb);

    }
}
