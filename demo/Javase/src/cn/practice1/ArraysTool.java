package cn.practice1;

import java.util.Arrays;
import java.util.List;
/**
 * <p>Description:数组转换为List</p>
 * <p>fill()</p>
 * <p>stream()</p>
 * <p>Class:ArraysTool</p>
 * <p>Powered by zxy On 2023-04-13 00:28  </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class ArraysTool {
    public static void main(String[] args) {
        Integer[] n1 = {1,2,3};
        System.out.println(n1);//[Ljava.lang.Integer;@41629346
        System.out.println(Arrays.toString(n1));//[1, 2, 3]
        System.out.println("--------");
        //数组转换为List
        List<Integer> ints = Arrays.asList(n1);
        System.out.println(ints);//[1, 2, 3]
        //asList() 返回List
        List<Integer> list = Arrays.asList(1, 2, 3);
        System.out.println(list);//[1, 2, 3]

        //fill()
        int[] nn = new int[6];
        System.out.println(Arrays.toString(nn));//[0, 0, 0, 0, 0, 0]
        Arrays.fill(nn, 6);
        System.out.println(Arrays.toString(nn));//[6, 6, 6, 6, 6, 6]
        Arrays.fill(nn, 1, 3, 5);//数组1 2 填充元素值为5
        System.out.println(Arrays.toString(nn));//[6, 5, 5, 6, 6, 6]

        //stream()
        int sum = 0;
        for (int i : nn) {
            //nn=[6, 5, 5, 6, 6, 6]
            sum += i;
        }
        System.out.println(sum);//34
        int sum2 = Arrays.stream(nn).sum();
        System.out.println(sum2);//34

        //toString()一维数组
        //deepToString()二维及以上
        System.out.println(Arrays.toString(nn));//[6, 5, 5, 6, 6, 6]
        Integer[] n2 = {1, 22, 333};
        System.out.println(Arrays.deepToString(n2));//[1, 22, 333]
        int[][][] n3 = {{{1}}, {{1, 2, 3}}, {{24, 1, 2}, {24}}};
        System.out.println(Arrays.deepToString(n3));//[[[1]], [[1, 2, 3]], [[24, 1, 2], [24]]]
        //sort()
    }
}
