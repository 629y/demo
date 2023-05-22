/*
 * Copyright (c) 2017, 2023, zxy.cn All rights reserved.
 *
 */
package cn.practice2;

/**
 * <p>Description:</p>
 * <p>Enum:ColorEnum</p>
 * 首先枚举是一个特殊的Class
 * 这个class相当于final static修饰，不能被继承
 * 他的构造方法强制被私有化，下面有一个默认的构造方法private ColorEnum();
 * 所有的枚举都继承自java.lang.Enum类，由于Java不支持多继承，所以枚举对象不能再继承其他类
 * <p>Powered by zxy On 2023/5/22 17:18 </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public enum ColorEnum {
    //每个枚举变量都是枚举类ColorEnum的实例，相当于RED=new ColorEnum(1),按序号来
    //每个成员变量都是final static修饰
    RED, GREEN, BLACK, YELLOW;

    public void ColorTest() {
        //ordinal返回枚举变量的序号
        for(ColorEnum color:ColorEnum.values()){
            System.out.println(color+",ordinal:"+color.ordinal()+",name:"+color.name());
        }
    }
}
