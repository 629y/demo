package cn.practice1;

import java.time.LocalDate;
import java.util.Date;

public class InterviewQuestion {
    public static void main(String[] args) {
        int[] nums = new int[7];
        nums[6] = 30;
        System.out.println(nums[6]);//30
        System.out.println(nums[1]);//0

        /*int[] nums = new int[7];
        nums[7] = 30;
        System.out.println(nums[7]);
        System.out.println(nums[1]);*/
        //访问超出数组范围

        Object[] objs = new Object[]{1, .5, new Date(), LocalDate.now()};
        Object[] os = new Object[10];
    }
}
