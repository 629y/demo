/*
 * Copyright (c) 2017, 2023, zxy.cn All rights reserved.
 *
 */
package cn.black;

/**
 * <p>Description:逢7过</p>
 * 游戏规则：从任意一个数字开始报数，当你要报的数字是包含7或者是7的倍数时都要说“过”
 * 需求：使用程序在控制台打印出1-100之间的满足逢七必过规则的数据
 * <p>Class:EverySevenPass</p>
 * <p>Powered by zxy On 2023/5/30 16:07 </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class EverySevenPass {
    //分析：个位7  十位7  7倍数
    //1 2 3 4 5 6 过 8 9 10 11 12 13 过 15 16 过 18 19 20 过...69 过 过 过 过 ... 80
    public static void main(String[] args) {
        //1.得到1~100之间的每一个数字
        //开始：1
        //结束：100
        for (int i = 1; i <= 100; i++) {
        //2.判断每一个数字，如果符合规则，就打印过，如果不符合规则就打印真实的数字
            if (i % 10 == 7 || i / 10 % 10 == 7 || i % 7 == 0) {
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }
    }
}
