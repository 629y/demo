package cn.practice1;

import java.util.Arrays;
import java.util.Random;
/**
 * <p>Description:利用数组实现冒泡排序效果</p>
 * <p>//声明10个元素的int数组，并赋值10个数(1-100)随机数，直接遍历输出，排序后，在输出</p>
 * <p>Class:BubbleSort</p>
 * <p>Powered by zxy On 2023-04-12 21:06  </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class BubbleSort {
    public static void main(String[] args) {
        //声明10个元素的int数组，并赋值10个数(1-100)随机数，直接遍历输出，排序后，在输出
        Random rand=new Random();
        int[] num=new int[10];
        for (int i = 0; i < num.length; i++) {
            num[i]= rand.nextInt(1,101);
        }
        System.out.println(Arrays.toString(num));

        //排序 升序
        Arrays.sort(num);
        //排序后输出
        System.out.println(Arrays.toString(num));

        //冒泡排序
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length-1-i; j++) {
                //>升序   <降序 Math.random()>.5
                if (num[j] > num[j+1]) {
                    int t=num[j];
                    num[j]=num[j+1];
                    num[j+1]=t;
                }
                //System.out.println(Arrays.toString(num));
            }
            //System.out.println(Arrays.toString(num));
        }
        System.out.println("冒泡排升序:"+Arrays.toString(num));

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length-1-i; j++) {
                if (num[j]<num[j+1]){
                    int t=num[j];
                    num[j]=num[j+1];
                    num[j+1]=t;
                }
            }
        }
        System.out.println("冒泡排降序:"+Arrays.toString(num));

        for (int i = 0; i < num.length * 2; i++) {
            int x = rand.nextInt(num.length);
            int y = rand.nextInt(num.length);
            if (x==y){
                --i;
                continue;
            }
            int t = num[x];
            num[x] = num[y];
            num[y] = t;
        }
        System.out.println("洗牌："+Arrays.toString(num));
    }
}
