/*
 * Copyright (c) 2017, 2023, zxy.cn All rights reserved.
 *
 */
package cn.black;

/**
 * <p>Description:</p>
 * <p>Class:StudentTest</p>
 * <p>Powered by zxy On 2023/5/25 21:45 </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class StudentTest {
    public static void main(String[] args) {
        //1.创建一个数组用来存储学生对象
        Student[] arr = new Student[3];

        //2.创建学生对象并添加到数组当中
        Student stu1 = new Student(1,"zhangsan",23);
        Student stu2 = new Student(2,"lisi",24);
        Student stu3 = new Student(3,"wangwu",25);

        //3.把学生对象添加到数组当中
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        //要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断
        Student stu4 = new Student(4,"zhaoliu",26);

        //唯一性判断
        //已存在---不用添加
        //不存在---就可以把学生对象添加进数组


        //把stu4添加到数组当中
        //1.数组已经存满---只能创建一个新的数组，新数组的长度 = 老数组 + 1
        //2.数组没有存满---直接添加




        //要求2：添加完毕之后，遍历所有学生信息



        //要求3：通过id删除学生信息-如果存在，则删除，如果不存在，则提示删除失败



        //要求4：删除完毕之后，遍历所有学生信息


        //要求5：查询数组id为“002”的学生，如果存在，则将他的年龄+1岁

    }


    //1.我要干嘛？ 唯一性判断
    //2.我干这件事情，需要什么才能完成？  数组 id
    //3.调用处是否需要继续使用方法的结果？ 必须返回
    public static boolean contains(Student[] arr,int id){
        for (int i = 0; i < arr.length; i++) {
            //依次获取到数组里面的每一个学生对象
            Student stu = arr[i];
            //获取数组中学生对象的id
            int sid = stu.getId();
            //比较
            if(sid == id){
                return true;
            }
        }
        //当循环结束之后，还没有找到一样的，那么就表示数组中要查找的id 是不存在的
        return false;

    }
}
