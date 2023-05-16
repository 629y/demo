/*
 * Copyright (c) 2017, 2023, zxy.cn All rights reserved.
 *
 */
package cn.practice2;

/**
 * <p>Description:定义接口</p>
 *
 * <p>Powered by zxy On 2023/5/16 17:41 </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */

public interface Db {
    String version = "1.0";

    //接口中的属性，自动变为public final 全局常量
    int i = 3;//全局静态常量

    //void show();
    //接口中的方法，会自动变为public abstract全局抽象，不写abstract也是抽象的方法
    public abstract void conn();

    static int pf(int i) {
        return i * i;
    }
    // 接口中的static实现方法，会自动变为public ,静态实现方法通过接口名可以直接调用

    default void version(){
        System.out.println(System.getProperty("java.version"));
        System.out.println(version);
    }
    //接口中的默认实现方法，是通过接口的实现类的实例对象，可以直接调用。
}
