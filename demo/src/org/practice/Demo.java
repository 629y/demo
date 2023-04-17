/*
 * Copyright (c) 2017, 2023, zxy.cn All rights reserved.
 *
 */
package org.practice;
import cn.practice2.User;
/**
 * <p>Description:调用执行方法</p>
 * <p>Class:</p>
 * <p>Powered by zxy On 2023/4/17 21:45 </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class Demo {
    public static void main(String[] args) {
        for (int i = 10; i > 0; i--) {
            User.print();
            //hello-user类中的静态输出语句
        }

    }
}
