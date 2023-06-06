package cn.practice;

import java.awt.*;

public class Bit_Operator {
    public static void main(String[] args) {
        System.out.println(0b11);//3-11-二进制
        System.out.println(011);//9-011-八进制
        // 8进制 0 1 2 3 4 5 6 7 10
        System.out.println(010);
        //010-8   020-16
        System.out.println(0xff);//255-ff-十六进制
        System.out.println(255);//255-十进制

        //移位
        System.out.println(2>>1<<2);//4
        //2-0000 0010
        //>>向右移1位
        //   000 0001-0000 0001-1
        //<<向左移2位
        //            0000 01-0000 0100 -4

        System.out.println(1<<3);//8
        System.out.println(0b1000);//8

        System.out.println(1>>1);//0
        System.out.println(1>>3);//0
        System.out.println("--------------");

        //10进制 %d
        int a = 10;
        System.out.println(a*2);//20
        System.out.println("--------------");

        //2进制 -b 直接输出进制,以十进制输出  a 97 ASCII
        System.out.println(0b11);//3
        System.out.println(0b00000011);//3

        //十进制转化为二进制
        System.out.println(Integer.toBinaryString(2));//2-10
        System.out.println(Integer.toBinaryString(3));//3-11
        System.out.println("--------------");
        //二进制转化为十进制
        int s2 = Integer.valueOf("1101",2);//1101-13
        System.out.println(s2);

        System.out.println("--------------");
        //10 to 16
        System.out.println(Integer.toHexString(255));//255-ff
        System.out.printf("%02x%n",255);//小写255-ff
        System.out.printf("%02X%n",255);//大写255-FF

        //16 to 10
        int n16 = Integer.valueOf("11",16);//11-17
        System.out.println(n16);

        //10 to 8
        System.out.println(Integer.toOctalString(16));//16-20
        //8 to 10
        int b =Integer.valueOf("20",8);//20-16
        System.out.println(b);

        //与运算 &
        System.out.println(0b10);//10-2
        System.out.println(2&3);
        //0000 0010-2
        //0000 0011-3
        //0000 0010-2
        System.out.println(4&3);

        Color c1 = new Color(255,0,255);
        Color c2 = new Color(0xff,0x00,0xff);
        System.out.println(0xff);//255
    }
}
