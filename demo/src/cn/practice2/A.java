package cn.practice2;

public class A {
    public A(int i){
        System.out.println("父类构造A(int i)");
    }

    static {
        System.out.println("父类static{}");
    }

    {
        System.out.println("父类init{}");
    }
    public int square(int i){
        System.out.println("Parent...square(int i)");
        return i*i;
    }

}
