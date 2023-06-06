package cn.practice3;

public class StringBuilderDemo {
    public static void main(String[] args) {
        m1();
        StringBuilder sbu = new StringBuilder();
        sbu.append("hello");
        sbu.append(18);
        sbu.insert(1,"Welcome - ");
        //sbu.append("Welcome - ");
        //sbu.append("Welcome - ",0,"Welcome - ".length());
        System.out.println(sbu);//hWelcome - ello18
        System.out.println(sbu.toString().concat("java"));//hWelcome - ello18java
        sbu.delete(0,5);
        System.out.println(sbu);//ome - ello18

        //错误的
        //String s = sbu;

        //String 转换为 StringBuilder
        String s1 = "hello";
        StringBuilder ss1 = new StringBuilder(s1);
        System.out.println(s1);//hello
        System.out.println(ss1);//hello
        System.out.println(ss1.toString());//hello
        System.out.println(ss1.reverse().append("java.18").toString().toUpperCase());//OLLEHJAVA.18

        //StringBuilder 转换为 String
        String s2 = ss1.toString();
        System.out.println(s2);//ollehjava.18
    }
    public static void m1() {
        StringBuilder su1 = new StringBuilder();
        StringBuilder su2 = new StringBuilder(6);
        StringBuilder su3 = new StringBuilder("hello");
        System.out.println(su1);//空
        System.out.println(su1.length());//0
        System.out.println(su2);//空
        System.out.println(su2.length());//0
        System.out.println(su3);//hello
        System.out.println(su3.length());//5
        StringBuffer suf1 = new StringBuffer();
        StringBuffer suf2 = new StringBuffer(6);
        StringBuffer suf3 = new StringBuffer("hello");
        System.out.println(suf1);//空
        System.out.println(suf1.length());//0
        System.out.println(suf2);//空
        System.out.println(suf2.length());//0
        System.out.println(suf3);//hello
        System.out.println(suf3.length());//5
    }
}

