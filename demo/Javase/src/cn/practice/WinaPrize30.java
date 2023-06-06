package cn.practice;

import java.util.Random;

/**
 * <p>Description:实现一个抽奖效果，中奖率为30%</p>
 * <p>Class:Random</p>
 * <p>Powered by zxy On 2023-04-10 22:00 </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class WinaPrize30 {
    public static void main(String[] args) {
        //实现一个抽奖效果，中奖率为30%
        Random rand = new Random();
        int ok = rand.nextInt(1, 101);
        if (ok <= 30) {
            System.out.println("恭喜，你中奖了，" + ok);
        } else {
            System.err.println("遗憾，未中奖.");
        }
    }
}
