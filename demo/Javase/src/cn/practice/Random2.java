package cn.practice;

import java.util.Random;
import java.util.UUID;
/**
 * <p>Description:</p>
 * <p>Class:Random</p>
 * <p>Powered by zxy On 2023-04-10 21:50  </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class Random2 {
    public static void main(String[] args) {
        System.out.println(System.getProperty("java.version"));//17.0.6
        //java.util.Date Calendar Scanner
        //java.util.Random java.util java官方的工具包
        //（1）实例化
        Random rand = new Random();
        //（2）使用
        System.out.println(rand.nextBoolean());//true
        System.out.println(rand.nextDouble());//0.17502483606452768
        System.out.println(rand.nextDouble(5));//2.404493828880103
        System.out.println(rand.nextDouble(5,10));//8.086035542378285
        //0-5 不包含5，之间的随机整数0 -4
        System.out.println(rand.nextInt(5));//0
        //1-100 的随机整数
        System.out.println(rand.nextInt(1,101));//36
        //利用循环语句，特殊5次，获取并输出5个随机整数（1-2）
        for (int i = 0; i < 5; i++) {
            System.out.println(rand.nextInt(1,3));
        }

        //3 UUID -------------------------
        UUID.randomUUID(); //最常用
        System.out.println(UUID.randomUUID().toString());
        //27720047-f27e-4ebc-a0f6-3189c8c48d8c
        System.out.println(UUID.fromString("095c64fe-c5bf-11ea-aec6-a402b9e2b04d"));
        //095c64fe-c5bf-11ea-aec6-a402b9e2b04d
        System.out.println(UUID.nameUUIDFromBytes("身份证号码".getBytes()));
        //84e0cb5d-57ed-395b-8cc0-4b4ab9a7997b
    }
}
