package cn.example;

import java.util.Random;
/**
 * <p>Description:格式化数字 78.55元 </p>
 * <p>Class:ExampleSecond07 </p>
 * <p>Powered by zxy On 2023-04-09 03:33  </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class ExampleSecond07 {
    public static void main(String[] args) {
        Random rand = new Random();
        double money = rand.nextDouble(10.000,99.999);
        System.out.printf("%.2f元%n",money);
        System.out.printf("%.3f元%n",money);
        System.out.printf("%.0f元%n",money);
        System.out.printf("%10.4f%n",money);
        System.out.printf("%10.4f%n",1f);
    }
}
