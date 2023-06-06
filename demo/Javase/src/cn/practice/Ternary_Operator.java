package cn.practice;

public class Ternary_Operator {
    public static void main(String[] args) {
        //boolean f = 条件 ？ true : false;是一个简单的if else 语句
        int i = false ? 3:4;
        System.out.println(i);
        //4

        int a = 50;
        int b = 20;
        int c = a>b?a:b;
        System.out.println(c);
        //50

        String result = Math.random() > .5?"成功":"失败";
        String result1 = 2 > .5?"成功":"失败";
        System.out.println(result);
        System.out.println(result1);
        System.out.println( Math.random());
        // Math.random()是0-1之间的double类型的小数
    }
}
