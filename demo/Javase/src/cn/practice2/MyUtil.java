/*
 * Copyright (c) 2017, 2023, zxy.cn All rights reserved.
 *
 */
package cn.practice2;

/**
 * <p>Description:函数式接口概念</p>
 * 有且只有一个抽象方法的接口，默认是函数式接口，
 *函数式接口可以使用lambda表达式作为方法接口参数来执行
 * <p>Powered by zxy On 2023/5/16 19:32 </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
@FunctionalInterface
public interface MyUtil {
    int pf(int i);
}