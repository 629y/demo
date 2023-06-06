package cn.practice1;

import java.util.Arrays;

/**
 * <p>Description:声明数组对象</p>
 * <p>`声明数组，是一个有序元素集合。java中数组元素的个数是固定的(声明后不能增加元素，不能删除元素)`</p>
 * <p>Class:Array1</p>
 * <p>Powered by zxy On 2023-04-13 01:16  </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
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

        System.out.println(Arrays.toString(ds));
        System.out.println(Arrays.toString(ds1));
        System.out.println(Arrays.toString(ds2));
        System.out.println(Arrays.toString(is));
        System.out.println(Arrays.toString(ds3));

        char[] cs = "学习程序设计java".toCharArray();
        String[] ss1 = "java,html,css".split(",");
        String[] ss2 = "java,html,css,javascript,mysql,vue,python".split(",",4);

        System.out.println(cs);
        System.out.println(Arrays.toString(ss1));
        System.out.println(Arrays.toString(ss2));

        System.out.println(is.length);//3
        System.out.println(is[is.length-1]);//3
        System.out.println(is[1]);//2
        is[0]=5;
        //is[is.length]=400;
        System.out.println(is[0]);//5
    }
}
