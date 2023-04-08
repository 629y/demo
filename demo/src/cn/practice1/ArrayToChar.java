package cn.practice1;

import java.util.Arrays;

public class ArrayToChar {
    public static void main(String[] args) {
        Book book = new Book();
        System.out.println((int) '中');
        System.out.println((int) '国');
        System.out.println((int) '学');

        char[] zs = "张三".toCharArray();
        for (char c:zs) {
            System.out.printf("%c = %d%n",c,(int)c);
        }

        char[] ls = "李四".toCharArray();
        for (char c:ls) {
            System.out.printf("%c = %d%n",c,(int)c);
        }

        String[] ns={"张三","李四","张丽","张三丰"};
        Arrays.sort(ns);
        System.out.println(Arrays.toString(ns));

        char[] sss = {'a','A'};
        Arrays.sort(sss);
        System.out.println(Arrays.toString(sss));//[A, a]
        System.out.println((int) 'a');//97
        System.out.println((int) 'A');//65
    }
}
