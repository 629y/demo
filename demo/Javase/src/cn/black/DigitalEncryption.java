/*
 * Copyright (c) 2017, 2023, zxy.cn All rights reserved.
 *
 */
package cn.black;

/**
 * <p>Description:数字加密</p>
 * 需求：某系统的数字密码（大于0），比如1983，采用加密方式进行传输
 * 规则如下：先得到每位数，然后每位数都加上5，再对10求余，最后将所有数字反转，得到一串新数
 * 1    9   8   3
 * +5   6   14  13   8
 * %10  6    4   3   8
 * 反转  8    3   4   6
 * 加密后的结果是：8346
 * <p>Class:DigitalEncryption</p>
 * <p>Powered by zxy On 2023/5/31 20:33 </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class DigitalEncryption {
    public static void main(String[] args) {
        //分析：1.把整数里面的每一位放到数组当中
        //反向推导
        //1>计算出数组的长度
        int num = 1983;
        //定义一个变量临时记录num的值，就是为了第三步的时候再次使用
        int tem = num;
        //定义一个变量进行统计
        int count = 0;
        while (num != 0) {
            //每一次循环就去掉右边的一个数字
            num = num / 10;
            //去掉一次计数器就自增一次
            count++;
        }
        //2>定义数组
        //动态初始化
        int[] arr = new int[count];
        //3>把整数上的每一位都添加到数组当中
        int index = arr.length - 1;
        while (tem != 0) {
            //获取tem里面的每一位数组
            int ge = tem % 10;
            //再去掉右边的那位数字
            tem = tem/10;
            //把当前获取到的个位添加到数组当中
            arr[index] =ge;
            index--;
        }
        //验证结果 1 2 3 4 5
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        //2.加密
        //每位数加上5
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 5;
        }
        //再对10求余
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] % 10;
        }
        //将所有数字反转
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        //8 3 4 6 --> 8346
        //3.把数组里面的每一个数字进行拼接，变成加密之后的结果
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            number = number * 10 + arr[i];
        }
        System.out.println(number);
    }
}
