package cn.practice1;

public class Array1 {
    //成员变量 属性 会自动初始化
    int[] score = new int[5];
    public static void main(String[] args) {
        //声明数组局部变量，声明数组变量
        double[] ds = new double[]{1.1,2.2,3.3,4.4,5.5};
        double[] ds1 = new double[]{1.1,2.2,3.3,4.4,5.5};
        double ds2 [] = new double[]{1.1,2.2,3.3,4.4,5.5};
        int[] is = {1,2,3};
        var ds3 = new double[3];

        char[] cs = "学习程序设计java".toCharArray();
        String[] ss1 = "java,html,css".split(",");
        String[] ss2 = "java,html,css,javascript,mysql,vue,python".split(",",2);

        System.out.println(is.length);
        System.out.println(is[is.length-1]);
        System.out.println(is[1]);
        is[0]=5;
        //is[is.length]=400;
        System.out.println(is[0]);
    }
}
