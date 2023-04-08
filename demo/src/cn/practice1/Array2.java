package cn.practice1;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        var ss = "java,html,css,javascript,mysql,vue,python".split(",");
        System.out.println(ss.length);
        System.out.println(ss);
        System.out.println(Arrays.toString(ss));

        System.out.println(ss[4]);

        int index = 0;
        for (String s:ss){
            System.out.println(ss[index++]);
        }
        for (int i = 0;i<ss.length;i++){
            System.out.printf("ss[%d] = %s%n",i,ss[i]);
        }
        for (int i = ss.length - 1;i>=0;i--){
            System.out.printf("ss[%d] = %s%n",i,ss[i]);
        }
    }
}
