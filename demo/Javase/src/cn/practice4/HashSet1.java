package cn.practice4;

import java.util.HashSet;
import java.util.Set;

public class HashSet1 {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<String>();
        set1.add(new String("OK"));
        set1.add(new String("OK"));
        set1.add(new String("OK"));
        System.out.println(new String("OK").hashCode());
        System.out.println(new String("OK").hashCode());
        System.out.println(new String("OK").hashCode());
        System.out.println(new String("OK").hashCode());
        System.out.println(set1.size());






//        Set<Student> ss = new HashSet<>();
//        ss.add(new Student(10,"李四"));
//        ss.add(new Student(10,"李四"));
//        ss.add(new Student(10,"李四"));
//        System.out.println(ss.size());
//        Student st = new Student(10,"张三丰");


//        String s1 = new String("mysql");
//        String s2 = new String("mysql");
//        set.add(s1);
//        set.add(s2);



















    }
}
