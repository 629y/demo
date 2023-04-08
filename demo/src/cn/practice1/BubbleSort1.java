package cn.practice1;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort1 {
    public static void main(String[] args) {
        //数字排序
        //数字
        Integer[] n1= {1,5,2,9,8,3,0};
        System.out.println("排序前："+ Arrays.toString(n1));

        Arrays.sort(n1);//T[] 数组 int[] Integer[]
        System.out.println("排升序1："+Arrays.toString(n1));
        Arrays.sort(n1,(x,y) ->x-y);
        System.out.println("排升序2："+Arrays.toString(n1));

        Arrays.sort(n1,(x,y) -> y-x);
        System.out.println("排降序："+Arrays.toString(n1));

        Arrays.sort(n1,(x,y) -> Math.random() > .5?-1:1);
        Random rand = new Random();
        for (int i = 0; i < n1.length; i++) {
            int a = rand.nextInt(n1.length);
            int b = rand.nextInt(n1.length);
            if (a==b){
                --i;
                continue;
            }
            int t = n1[a];
            n1[a] = n1[b];
            n1[b] = t;
        }
        System.out.println("排乱序："+Arrays.toString(n1));

        //String字符串对象排序
        //字符串排序
        System.out.println("---------------------");
        String[] ss = {"java", "c", "c++", "go", "rust", "ruby", "javascript", "python", "c#"};
        System.out.println("排序前："+Arrays.toString(ss));

        Arrays.sort(ss);
        System.out.println("排升序："+Arrays.toString(ss));

        Arrays.sort(ss,(a,b) -> b.compareTo(a));
        System.out.println("排降序："+Arrays.toString(ss));

        Arrays.sort(ss,(a,b) -> a.length() - b.length());
        System.out.println("根据字符长度升序："+Arrays.toString(ss));

        Arrays.sort(ss,(a,b) -> b.length() - a.length());
        System.out.println("根据字符长度降序："+Arrays.toString(ss));

        Random aa = new Random();
        for (int i = 0;i< ss.length;i++){
            int a = aa.nextInt(ss.length);
            int b = aa.nextInt(ss.length);
            if (a==b){
                --i;
                continue;
            }
            String t = ss[a];
            ss[a] = ss[b];
            ss[b] = t;
        }
        System.out.println("洗牌:"+Arrays.toString(ss));
        //用户对象排序
    }
}
