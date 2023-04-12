package cn.practice1;

import java.time.LocalDate;
import java.util.Date;
/**
 * <p>Description:面试题:`如下代码能不能编译，有没有错误，如果没有错误程序输入结果是？`</p>
 * <p>声明一个可以包括任何类型元素的数组？</p>
 * <p>Class:InterviewQuestion</p>
 * <p>Powered by zxy On 2023-04-13 00:50  </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
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

        //声明一个可以包括任何类型元素的数组？
        Object[] objs = new Object[]{1, .5, new Date(), LocalDate.now()};
        Object[] os = new Object[10];
    }
}
