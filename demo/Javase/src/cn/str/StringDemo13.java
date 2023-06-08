/*
 * Copyright (c) 2017, 2023, zxy.cn All rights reserved.
 *
 */
package cn.str;

/**
 * <p>Description:游戏骂人敏感词替换</p>
 * <p>Class:</p>
 * <p>Powered by zxy On 2023/6/8 21:31 </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class StringDemo13 {
    public static void main(String[] args) {
        //1.获取到说的话
        String talk = "你玩的真好，CNM，以后不要再玩了，TMD";
        //2.定义一个敏感词库
        String[] arr={"TMD","CNM","SB","MLGB"};
        //3.循环得到数组中的每一个敏感词，依次进行替换
        for (int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i], "***");
        }
        //3.打印结果
        System.out.println(talk);
    }
}
