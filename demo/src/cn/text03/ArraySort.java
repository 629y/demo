package cn.text03;

import java.util.Arrays;
import java.util.Random;

public class ArraySort {
    public static void main(String[] args) {
        //编程实现对一个int[] a = new int[10]数组排序（排序方式没有要求，顺序没有要求）
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = new Random().nextInt(100);
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}

