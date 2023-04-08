package cn.practice;

import java.util.Set;

public class ForEach1 {
    public static void main(String[] args) {
        //System.out.println(System.getProperty("java.version"));
        Set<Object> ks = System.getProperties().keySet();
        for (Object k:ks){
            System.out.println(k+"="+System.getProperty(k.toString()));
        }
    }
}
