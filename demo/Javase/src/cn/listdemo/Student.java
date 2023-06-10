/*
 * Copyright (c) 2017, 2023, zxy.cn All rights reserved.
 *
 */
package cn.listdemo;

/**
 * <p>Description:定义一个集合，添加一些学生对象，并进行遍历
 *  学生类的属性为：姓名，年龄</p>
 * <p>Class:</p>
 * <p>Powered by zxy On 2023/6/10 14:29 </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class Student {
    //1.私有化成员变量
    //2.空参构造方法
    //3.带全部参数的构造方法
    //4.get/set 方法

    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
