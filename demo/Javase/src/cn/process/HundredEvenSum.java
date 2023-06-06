package cn.process;

import java.util.stream.IntStream;
/**
 * <p>Description:1-100的和，其中偶数和</p>
 * <p>Class:HundredEvenSum</p>
 * <p>Powered by zxy On 2023-04-11 18:29  </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class HundredEvenSum {
    public static void main(String[] args) {
        //IntStream interface java 1.8新技术 流技术
        int sum = IntStream.rangeClosed(1,100).sum();
        System.out.println("1+2+3+...+100="+sum);

        //其中，求偶数和
        int sum1 = IntStream.rangeClosed(1,100).filter(e->e%2==0).sum();
        System.out.println("2+4+6+...+100="+sum1);

        //其中，求偶数和
        int s=0;
        for (int i = 1; i <= 100; i++) {
            if (i%2==0){
                s+=i;
            }
        }
        System.out.println(s);
    }
}
