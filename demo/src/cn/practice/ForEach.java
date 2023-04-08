package cn.practice;

import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        //声明int[] 数组
        int[] nums = {1,2,3,4,5,6};
        for (int i=0;i< nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        for (int i = nums.length-1;i>=0;i--){
            System.out.print(nums[i]+" ");
        }
        System.out.println();

        //for each for:
        for (int i:new int[]{1,2,3}){
            System.out.println(i);
        }

        List<String> list = List.of("java","html","mysql","javascript");
        for (var s:list){
            System.out.println(s);
        }

        for (int i = list.size()-1;i>=0;i--){
            System.out.println(list.get(i));
        }
    }
}
