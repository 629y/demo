package cn.practice1;

import java.util.Arrays;
/**
 * <p>Description:Arrays工具类的学用方法(toString(),sort(),fill())</p>
 * <p>Class:MultidimensionalArray</p>
 * <p>Powered by zxy On 2023-04-12 22:49  </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class MultidimensionalArray {
    public static void main(String[] args) {
        String s;
        String[] s1;
        String[][] s2;
        String[][][] s3;
        String[][][][] s4;
        String[][][][][] s5;

        //声明初始化二维数组
        int[][] i2= {{1,2,3},{11,22},{333}};
        var i3 = new int[][]{{1, 2, 3}, {11, 22}, {333}};
        System.out.println(i3[2][0]);//333
        for (int[] nn : i2) {
            for (int t : nn) {
                System.out.print(t + " ");
                //1 2 3
                //11 22
                //333
            }
            System.out.println();
        }
        for (int i = 0; i < i2.length; i++) {
            for (int j = 0; j < i2[i].length; j++) {
                System.out.printf("i2[%d][%d] = %d ", i, j, i2[i][j]);
                //i2[0][0] = 1 i2[0][1] = 2 i2[0][2] = 3
                //i2[1][0] = 11 i2[1][1] = 22
                //i2[2][0] = 333
            }
            System.out.println();
        }

        //6 0-5
        int[] n1 = new int[6];
        //15
        int[][] n2 = new int[3][5];
        System.out.println(Arrays.toString(n2));//[[I@7530d0a, [I@27bc2616, [I@3941a79c]
        System.out.println(Arrays.deepToString(n2));//[[0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0]]
        System.out.println(Arrays.deepToString(i2));//[[1, 2, 3], [11, 22], [333]]
        String[][][] ss3 = new String[][][]{
                {{"aa", "bb"}, {"cc"}},
                {{}, {"ee", "ff"}}
        };
        System.out.println(ss3[1][1][1]);//ff
    }
}
