/*
 * Copyright (c) 2017, 2023, zxy.cn All rights reserved.
 *
 */
package cn.practice2;

/**
 * <p>Description:</p>
 * <p>Class:</p>
 * <p>Powered by zxy On 2023/5/15 21:50 </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */

public class B extends A {

    public B(int i){
        super(3);
        System.out.println("子类构造B(int i)");
    }

    // 重载 可以出现在一类中，也可以出现在继承关系。
    public double square(double d) {
        return d * d;
    }

    //重写 覆盖 只能出现继承关系
    public int square(int i) {
        System.out.println("B....square(int i)");
        return i * i;
//        return super.square(i);
    }

    public int getNum(int i){
        return super.square(i);//调用父类
//        return this.square(i);//调用子类
//        return square(i);//和上面相等  this.square=square 调用子类
    }

    static {
        System.out.println("子类static{}");
    }

    {
        System.out.println("子类init{}");
    }

    public static void main(String[] args) {
        B b = new B(3);
        System.out.println(b.square(3));
    }
}

