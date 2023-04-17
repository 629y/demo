/*
 * Copyright (c) 2017, 2023, zxy.cn All rights reserved.
 *
 */
package org.practice;

/**
 * <p>Description:单例模式（Singleton Pattern）是 Java 中最简单的设计模式之一
 * 1、单例类只能有一个实例。
 * 2、单例类必须自己创建自己的唯一实例。
 * 3、单例类必须给所有其他对象提供这一实例。</p>
 * <p>Class:Stu</p>
 * <p>Powered by zxy On 2023/4/18 0:29 </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class Stu {
    private Stu() {
    }
    public static Stu stu;
    public static Stu getInstance() {
        if (stu == null) {
            stu = new Stu();
        }
        return stu;
    }
}
