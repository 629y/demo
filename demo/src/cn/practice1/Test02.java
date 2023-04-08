package cn.practice1;

import java.util.Random;

public class Test02 {
    //2.
//    public byte count(byte a,byte b){
//        return (byte)(a-b);
//        //return (byte)a-b;
//        //return a+b;
//        //return (byte)b/a;
//    }
    public static void main(String[] args) {
        //4.
        //int No.1;
        char ch;
        //float new;
        //string 3a;

//        //5.
//        int a = 6;
//        int b = 4;
//        System.out.println(a*=b+2);//36

        //6.
        int x=10,y=10;
        System.out.println((x++)+","+(--y));//10,9

//        //7.
//        float a=12.28f;
//        int i = (int)a;
//        System.out.println(i);//12

        //8.
        System.out.println(false||true&&false);//false
        System.out.println(false||(true&&!false));//true

        //10.
        int i = 123;
        long j = 456;
        j=i;
        j=(long)i;
        i=(int)j;
        //i=j;

//        //二、2.
//        int a = 1;
//        short b = 2+a;
//        //错误

        //二、5.
        Random ra = new Random();

//        //三、2.
//        short s1 = 1;
//        s1 = s1 + 1;
//        //错误  s1+1运算结果是int型，需要强制转换类型

        short s1 = 1;
        s1 += 1;

    }
}
