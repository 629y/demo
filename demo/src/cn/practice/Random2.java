//package cn.practice;
//
//import java.util.Random;
//import java.util.UUID;
//
//public class Random2 {
//    public static void main(String[] args) {
//        //2 java.util.Random类-------------------------
//        System.out.println(System.getProperty("java.version"));
////java.util.Date Calendar Scanner
////java.util.Random java.util java官方的工具包
////（1）实例化
//        Random rand = new Random();
////（2）使用
//        System.out.println(rand.nextBoolean());
//        System.out.println(rand.nextDouble());
//        System.out.println(rand.nextDouble(5));
//        System.out.println(rand.nextDouble(5,10));
////0-5 不包含5，之间的随机整数0 -4
//        System.out.println(rand.nextInt(5));
////1-100 的随机整数
//        System.out.println(rand.nextInt(1,101));
////利用循环语句，特殊5次，获取并输出5个随机整数（1-2）
//        for (int i = 0; i < 5; i++) {
//            System.out.println(rand.nextInt(1,3));
//        }
////实现一个抽奖效果，中奖率为30%
//        Random rand = new Random();
//        int ok = rand.nextInt(1, 101);
//        if (ok <= 30) {
//            System.out.println("恭喜，你中奖了，" + ok);
//        } else {
//            System.err.println("遗憾，未中奖.");
//        }
//        //3 UUID -------------------------
//        UUID.randomUUID(); //最常用
//        System.out.println(UUID.randomUUID().toString());
//        System.out.println(UUID.fromString("095c64fe-c5bf-11ea-aec6-a402b9e2b04d"));
//        System.out.println(UUID.nameUUIDFromBytes("身份证号码".getBytes()));
//    }
//}
