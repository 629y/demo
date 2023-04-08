package cn.practice;

public class For2 {
    public static void main(String[] args) {
        int i =1;
        for (;i<10;){
            System.out.printf("%d ",i++);//1 2 3 4 5 6 7 8 9
        }
        System.out.println();
        System.out.println(i);//10
        System.out.println("\r\n"+i);//换行输出
    }
}
