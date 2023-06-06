package cn.practice1;

import java.util.Arrays;
/**
 * <p>Description:实现数组升序，降序，乱序（数字数组，字符串数组，对象数组，汉字排序机制，字符串长度）</p>
 * <p>Class:ArrayToChar</p>
 * <p>Powered by zxy On 2023-04-13 01:00  </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class ArrayToChar {
    public static void main(String[] args) {
        Book book = new Book();
        System.out.println((int) '中');//20013
        System.out.println((int) '国');//22269
        System.out.println((int) '学');//23398

        char[] zs = "张三".toCharArray();
        for (char c:zs) {
            System.out.printf("%c = %d%n",c,(int)c);
            //张 = 24352
            //三 = 19977
        }

        char[] ls = "李四".toCharArray();
        for (char c:ls) {
            System.out.printf("%c = %d%n",c,(int)c);
            //李 = 26446
            //四 = 22235
        }

        String[] ns={"张三","李四","张丽","张三丰"};
        Arrays.sort(ns);
        System.out.println(Arrays.toString(ns));//[张三, 张三丰, 张丽, 李四]

        char[] sss = {'a','A'};
        Arrays.sort(sss);
        System.out.println(Arrays.toString(sss));//[A, a]
        System.out.println((int) 'a');//97
        System.out.println((int) 'A');//65
    }
}
