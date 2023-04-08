package cn.practice1;

import java.util.Arrays;
import java.util.List;

public class ArraysTool {
    public static void main(String[] args) {
        Integer[] n1 = {1,2,3};
        System.out.println(n1);
        System.out.println(Arrays.toString(n1));
        System.out.println("--------");
        //数组转换为List
        List<Integer> ints = Arrays.asList(n1);
        System.out.println(ints);
        //asList() 返回List
        List<Integer> list = Arrays.asList(1, 2, 3);
        System.out.println(list);

        //file()
        int[] nn = new int[6];
        System.out.println(Arrays.toString(nn));
        Arrays.fill(nn, 6);
        System.out.println(Arrays.toString(nn));
        Arrays.fill(nn, 1, 3, 5);//数组1 2 填充元素值为5
        System.out.println(Arrays.toString(nn));

        //stream()
        int sum = 0;
        for (int i : nn) {
            sum += i;
        }
        System.out.println(sum);
        int sum2 = Arrays.stream(nn).sum();
        System.out.println(sum2);

        //toString()一维数组
        //deepToString()二维及以上
        System.out.println(Arrays.toString(nn));
        Integer[] n2 = {1, 22, 333};
        System.out.println(Arrays.deepToString(n2));
        int[][][] n3 = {{{1}}, {{1, 2, 3}}, {{24, 1, 2}, {24}}};
        System.out.println(Arrays.deepToString(n3));
        //sort()
    }
}
