package cn.practice;

public class ContinueBreak {
    public static void main(String[] args) {
        while (true){
            System.out.println(2);
            //退出终止当前循环语句，执行到循环语句后
            break;
        }
        for (int i = 0; i < 20; i++) {
            if (i%2==0){
                //结束本次，立即开始下一次循环
                continue;
            }
            System.out.print(i+" ");
            if (i>10){
                break;
            }
        }
    }
}
