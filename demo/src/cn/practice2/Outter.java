package cn.practice2;

public class Outter {
    //成员 public 静态的内部类
    public static class out{
        public static void println(Object obj){
            System.out.println(obj);
        }
    }
    class Demo{
    }
    public static void main(String[] args) {
        out.println("hello world 中文效果");
        System.out.println("hello world 中文效果");
        //方法体，代码中，局部内容类
        //@Data
        class Book {
            private int id;
            private String name;
        }
    }
}
