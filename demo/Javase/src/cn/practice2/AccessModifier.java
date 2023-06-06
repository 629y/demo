/*
 * Copyright (c) 2017, 2023, zxy.cn All rights reserved.
 *
 */
package cn.practice2;

/**
 * <p>Description:属性 成员变量 静态属性 类变量 静态 static 只分配一次内存 常量 不能修改只能使用</p>
 * <p>Class:AccessModifier</p>
 * <p>Powered by zxy On 2023/4/17 20:54 </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class AccessModifier {
    /*属性 成员变量*/
    public int id; //全局
    private final int num = 18;//私有
    protected String addr = "郑州";//受保护
    String name = "jack";//友好,默认

    /* 静态属性 类变量 */
    public static int id1 = 3;
    //静态 static 只分配一次内存

    /*常量 不能修改只能使用*/
    public final int AGE = 18;

    public static void main(String[] args) {

    }
}
