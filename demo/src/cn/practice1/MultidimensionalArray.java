package cn.practice1;

import java.util.Arrays;

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
        System.out.println(i3[2][0]);
        for (int[] nn : i2) {
            for (int t : nn) {
                System.out.print(t + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < i2.length; i++) {
            for (int j = 0; j < i2[i].length; j++) {
                System.out.printf("i2[%d][%d] = %d ", i, j, i2[i][j]);
            }
            System.out.println();
        }

        //6 0-5
        int[] n1 = new int[6];
        //15
        int[][] n2 = new int[3][5];
        System.out.println(Arrays.toString(n2));
        System.out.println(Arrays.deepToString(n2));
        System.out.println(Arrays.deepToString(i2));
        String[][][] ss3 = new String[][][]{
                {{"aa", "bb"}, {"cc"}},
                {{}, {"ee", "ff"}}
        };
        System.out.println(ss3[1][1][1]);
    }
}
