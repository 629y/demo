/*
 * Copyright (c) 2017, 2023, zxy.cn All rights reserved.
 *
 */
package cn.practice2;

/**
 * <p>Description:User.java文件有三个类外部类User、Teacher,内部类 User.Book</p>
 * <p>Class:User</p>
 * <p>Powered by zxy On 2023/4/17 20:15 </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class User {
    /*初始化程序块*/
    {for(int i = 5;i > 0; i--){
        System.out.println(i);
    }}

    /*成员 类 内部类*/
    class Book{
    }

    //对象
    //以文件形式管理信息
    //属性
    int id = 3;

    //方法
    void pring() {
    }

    /*静态程序块*/
    static {
        System.out.println("hello");
    }
    {
        System.out.println("init2");
    }

    class Teacher{
    }

    public/*访问修饰权限*/ static/*静态方法，当前方法不用实例化对象，可以通过类型直接使用此方法*/ void/*没有返回值*/ print/*方法名*/(/* 形参列表*/) {
        //方法体
        //return; 代表结束当前方法执行
    }
}
