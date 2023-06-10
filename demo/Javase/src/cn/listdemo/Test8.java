/*
 * Copyright (c) 2017, 2023, zxy.cn All rights reserved.
 *
 */
package cn.listdemo;

import java.util.ArrayList;

/**
 * <p>Description:定义Javabean类：Phone
 * Phone属性：品牌，价格
 * main 方法中定义一个集合，存入三个手机对象
 * 分别为：小米，1000，苹果，8000，锤子2999
 * 定义一个方法，将价格低于3000的手机信息返回</p>
 * <p>Class:</p>
 * <p>Powered by zxy On 2023/6/10 16:34 </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class Test8 {
    public static void main(String[] args) {
        //1.创建集合对象
        ArrayList<Phone> list = new ArrayList<>();
        //2.创建手机的对象
        Phone p1 = new Phone("小米",1000);
        Phone p2 = new Phone("苹果",8000);
        Phone p3 = new Phone("锤子",2999);
        //3.添加数据
        list.add(p1);
        list.add(p2);
        list.add(p3);
        //4.调用方法
        ArrayList<Phone> phoneInfoList = getPhoneInfo(list);

        //5.遍历集合
        for (int i = 0; i < phoneInfoList.size(); i++) {
            Phone phone = phoneInfoList.get(i);
            System.out.println(phone.getBrand() + ","+ phone.getPrice());
        }
    }
    //1.我要干嘛？ 查询手机信息
    //2.我干这件事情，需要什么才能完成？  集合
    //3.我干完了，方法的调用处是否需要继续使用结果？ 返回
    public static ArrayList<Phone> getPhoneInfo(ArrayList<Phone> list){
        //定义一个集合用于存储价格低于3000 的手机对象
        ArrayList<Phone> resultList = new ArrayList<>();
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            Phone p = list.get(i);
            int price = p.getPrice();
            //如果当前手机的价格低于3000，那么就把手机对象添加到resultList 中
            if (price < 3000) {
                resultList.add(p);
            }
        }
        //返回resultList
        return resultList;
    }

}
