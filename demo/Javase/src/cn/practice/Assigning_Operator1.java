package cn.practice;
public class Assigning_Operator1 {
    public static void main(String[] args) {
        int x, y, z; // 定义3个整型的变量
        x = y = z = 5; // 为变量赋初值为5
        x += 10; // 等价于x=x+10，结果x=15
        y -= 3; // 等价于y=y-3，结果y=2
        z *= 5; // 等价于z=z*5，结果z=25
        x /= 4; // 等价于x=x/4，结果x=3
        z %= x; // 等价于z=z%x，结果z=1
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}