package cn.practice;

public class Comparison_Operator {
    public static void main(String[] args) {
        System.out.println(2>3);
        System.out.println(2>=3);
        System.out.println(2<3);//true
        System.out.println(2<=3);//true
        System.out.println(2==3);
        System.out.println(2!=3);//true
        System.out.println(1==.5);//false
        System.out.println("-----------------");
        int a = 1;
        double b = 1.0;
        System.out.println(a == b);//true
        System.out.println("-----------------");
        String s1 = "ok";
        String s2 = "ok";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);
        //判断字符串对象的堆内存中的地址是否相等
        System.out.println(s1.equals(s2));
        //s1.equals(s2)判断字符串值是否相等
        System.out.println("-----------------");
        String s3 = new String("java");
        String s4 = new String("java");;
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
    }
}
