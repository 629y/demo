/*
 * Copyright (c) 2017, 2023, zxy.cn All rights reserved.
 *
 */
package cn.listdemo;

import java.util.ArrayList;

/**
 * <p>Description:定义一个集合，添加字符串，并进行遍历
 * 遍历格式参照：[元素1,元素2,元素3]</p>
 * <p>Class:</p>
 * <p>Powered by zxy On 2023/6/10 10:40 </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class Test1 {
    public static void main(String[] args) {
        //1.创建集合
        ArrayList<String> list = new ArrayList<>();
        //2.添加元素
        list.add("点赞了吗？");
        list.add("点赞了吗？");
        list.add("点赞了吗？");
        list.add("点赞了吗？");
        //3.遍历
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1){
                System.out.print(list.get(i));
            }else {
                System.out.print(list.get(i) + ",");
            }
        }
        System.out.print("]");
    }
}
