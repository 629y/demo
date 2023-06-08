/*
 * Copyright (c) 2017, 2023, zxy.cn All rights reserved.
 *
 */
package cn.str;

/**
 * <p>Description:手机号加密</p>
 * <p>Class:</p>
 * <p>Powered by zxy On 2023/6/8 20:29 </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class StringDemo10 {
    public static void main(String[] args) {
        //1.获取一个手机号码
        String phoneNumber = "12345665432";
        //2.截取手机号码前面三位
        String start = phoneNumber.substring(0, 3);
        //3.截取手机号码后面四位
        String end = phoneNumber.substring(7);
        //4.拼接
        String result = start + "****" + end;
        //5.打印
        System.out.println(result);
    }
}
