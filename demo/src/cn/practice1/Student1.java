package cn.practice1;

import java.util.Arrays;

public class Student1 {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setId(10);
        stu.setName("aa");
        stu.setScore(50);
        stu.setAddress("郑州");
        System.out.println(stu);

        //声明自定义类对象数组，并初始化
        Student[] stus = new Student[]{
                new Student(19, "张三", 80, "北京"),
                new Student(22, "张三丰", 20, "北京"),
                new Student(13, "李强", 90, "河南"),
                new Student(15, "赵勇", 82, "河南"),
                new Student(3, "周二", 66, "北京"),
                new Student(6, "赵七", 45, "上海")
        };
        System.out.println(Arrays.toString(stus));

        //根据对象的成功降序
        Arrays.sort(stus);
        System.out.println(Arrays.toString(stus));
    }
}
