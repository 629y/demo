package cn.practice4;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * <p>Project: HashSet-实例化对象，添加元素
 * <p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class HashSet2 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("java");
        set.add("javascript");
        set.addAll(List.of("php", "es6", "ts", "ts", "ts"));
        System.out.println(set.size());

        String s1 = new String("python");
        set.add(s1);
        System.out.println(s1);

        String s2 = new String("python");
        //如果有相关的元素内容，就保留原来的元素，添加取消
        set.add(s2);
        System.out.println(s2);

        System.out.println(set.size());

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        System.out.println(set.contains(s2));
        System.out.println("----------------------");
        for(String s : set){
            System.out.println(s == s2);
        }
    }
}
