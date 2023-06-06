/*
 * Copyright (c) 2017, 2023, zxy.cn All rights reserved.
 *
 */
package cn.str;

import java.util.Scanner;

/**
 * <p>Description:已知正确的用户名和密码，请用程序实现模拟用户登录
 * 总共给三次机会，登录之后，给出相应的提示</p>
 * <p>Class:</p>
 * <p>Powered by zxy On 2023/6/6 19:57 </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class StringDemo4 {
    public static void main(String[] args) {
        //读题拆解法
        //1.定义两个变量记录正确的用户名和密码
        String rightUsername = "zhangsan";
        String rightPassword = "123456";

        Scanner sc = new Scanner(System.in);
        //2.键盘录入用户名和密码
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名：");
            String username = sc.next();
            System.out.println("请输入密码：");
            String password = sc.next();

            //3.比较
            if (username.equals(rightUsername) && password.equals(rightPassword)){
                System.out.println("用户登录成功");
                break;
            }else {
                if (i==2){
                    System.out.println("账号"+username +"被锁定");//最后一次机会也输入错误，此时要提示账号被锁定
                }else {
                    System.out.println("用户登录失败，用户名或密码有误，您还剩下"+(2-i)+"次机会");//2 1 0
                }
            }
        }
    }
}
