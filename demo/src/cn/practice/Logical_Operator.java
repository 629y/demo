package cn.practice;

public class Logical_Operator {
    public static void main(String[] args) {
        //逻辑运算符 && &  ||  |  ! ^
        //&& 与   (有一非则非) 支持短路
        System.out.println(true && true);//true
        System.out.println(true && false);//false
        System.out.println(false && false);//false
        System.out.println(false && true);//false
        System.out.println("------------------");

        //& 与   (有一非则非)[不支持短路：做无用功，即使已知结果，亦继续运行]
        System.out.println(true && true);//true
        System.out.println(true && false);//false
        System.out.println(false && false);//false
        System.out.println(false && true);//false
        System.out.println("------------------");

        int i = 3;
        System.out.println(i>5 && ++i==4);//false
        System.out.println(i);//3
        System.out.println("------------------");

        //逻辑或 || | (有一真则真)[支持短路]
        System.out.println(true || true);//true
        System.out.println(true || false);//true
        System.out.println(false || false);//false
        System.out.println(false || true);//true
        System.out.println("------------------");

        //逻辑或 | (有一真则真)[不支持短路]
        System.out.println(true | true);//true
        System.out.println(true | false);//true
        System.out.println(false | false);//false
        System.out.println(false | true);//true
        System.out.println("------------------");

        //逻辑非 not !
        System.out.println(!(2==3) == true);//true

        //逻辑异或 ^ (互斥)[两者不同为true,两者相同为false]
        System.out.println(true ^ true);//false
        System.out.println(true ^ false);//true
        System.out.println(false ^ false);//false
        System.out.println(false ^ true);//true

        System.exit(0);//出口
    }
}
