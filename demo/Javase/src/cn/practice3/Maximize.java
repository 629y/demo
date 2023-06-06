package cn.practice3;

import java.util.Arrays;

public class Maximize {
//    public long max(long ... n){
//        long max = 0;
//        if (n.length == 0){
//            max = 0;
//        } else if (n.length == 1) {
//            max = n[0];
//        }else {
//            for (long t:n) {
//                max = Math.max(max,t);
//            }
//        }
//        return max;
//    }

//    public long max(long ... n){
//        long max = 0;
//        if (n.length == 0){
//            max = 0;
//        } else if (n.length == 1) {
//            max = n[0];
//        }else {
//            for (long t:n) {
//                if (t>max){
//                    max = t;
//                }
//            }
//        }
//        return max;
//    }

//    public long max(long ... n){
//        long max = 0;
//        if (n.length == 0){
//            max = 0;
//        } else if (n.length == 1) {
//            max = n[0];
//        }else {
//            Arrays.sort(n);
//            max = n[n.length-1];
//        }
//        return max;
//    }

    public long max(long...n){
        Arrays.sort(n);
        return n.length == 0?0:n[n.length-1];
    }
    public  long sum(long...a){
        long t = 0;
        for (long n:a){
            t+=n;
        }
        return t;
    }

}
