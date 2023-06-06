/*
 * Copyright (c) 2017, 2023, zxy.cn All rights reserved.
 *
 */
package cn.practice2;

/**
 * <p>Description:内部类</p>
 * <p>Class:</p>
 * <p>Powered by zxy On 2023/5/16 19:50 </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class Outter {
    //成员 public 静态的内部类
    public static class out{
        public static void println(Object obj){
            System.out.println(obj);
        }
    }
    class Demo{
    }
    public static void main(String[] args) {
        out.println("hello world 中文效果");
        System.out.println("hello world 中文效果");
        //方法体，代码中，局部内容类
        //@Data
        class Book {
            private int id;
            private String name;
        }
    }
}