/*
 * Copyright (c) 2017, 2023, zxy.cn All rights reserved.
 *
 */
package cn.black;

/**
 * <p>Description:定义数组存储4个女朋友的对象</p>
 * 女朋友的属性：姓名、年龄、性别、爱好
 * 要求1：计算出四个女朋友的平均年龄
 * 要求2：统计年龄比平均值低的女朋友有几个？并把她们的所有信息打印出来
 * <p>Class:GirlFriend</p>
 * <p>Powered by zxy On 2023/5/25 21:19 </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class GirlFriend {
    private String name;
    private int age;
    private String gender;//性别-也可以用char类型
    private String hobby;

    public GirlFriend() {
    }

    public GirlFriend(String name, int age, String gender, String hobby) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hobby = hobby;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
