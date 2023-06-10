/*
 * Copyright (c) 2017, 2023, zxy.cn All rights reserved.
 *
 */
package cn.listdemo;

import java.util.ArrayList;

/**
 * <p>Description:查找用户是否存在
 *需求：1.main 方法中定义一个集合，存入三个用户对象
 *      用户属性为：id,username,password
 *     2.要求：定义一个方法，根据id 查找对应的用户信息
 *       如果存在，返回索引
 *       如果不存在，返回-1</p>
 * <p>Class:</p>
 * <p>Powered by zxy On 2023/6/10 15:52 </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class Test7 {
    public static void main(String[] args) {
        //1.创建集合
        ArrayList<User> list = new ArrayList<>();
        //2.创建三个用户对象
        User u1 = new User("001","zhangsan","123456");
        User u2 = new User("002","lisi","1234567");
        User u3 = new User("003","wangwu","12345678");
        //3.把用户对象添加到集合当中
        list.add(u1);
        list.add(u2);
        list.add(u3);

        //4.查找索引
        int index = getIndex(list, "001");
        //5.打印
        System.out.println(index);
    }
    public  static int getIndex(ArrayList<User> list,String id){
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            String uid = u.getId();
            if (uid.equals(id)){
                return i;
            }
        }
        return -1;
    }
}
