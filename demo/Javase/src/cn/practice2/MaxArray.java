package cn.practice2;

public class MaxArray {
    public long max(long...n){
        long max = 0;
        if (n.length == 0){
            max = 0;
        } else if (n.length==1) {
            max = n[0];
        }else {
            for (long t:n){
                max = Math.max(max,t);
            }
        }
        return max;
    }
}
