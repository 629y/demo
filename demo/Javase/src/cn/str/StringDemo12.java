/*
 * Copyright (c) 2017, 2023, zxy.cn All rights reserved.
 *
 */
package cn.str;

/**
 * <p>Description:游戏骂人敏感词替换</p>
 * <p>Class:</p>
 * <p>Powered by zxy On 2023/6/8 21:02 </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class StringDemo12 {
    public static void main(String[] args) {
        //1.获取到说的话
        String talk = "你玩的真好，以后不要再玩了，TMD";

        //2.把里面的敏感词TMD替换为***
        String result = talk.replace("TMD","***");
        //3.打印结果
        System.out.println(result);
    }
}
