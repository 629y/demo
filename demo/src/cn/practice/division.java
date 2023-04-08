package cn.practice;

public class division {
    public static void main(String[] a) {
        //使用main入口方法参数实现除法效果
        int x=Integer.parseInt(a[0]);
        int y=Integer.parseInt(a[1]);
        if (x%y==0){
            System.out.printf("%d/%d=%d",x,y,x/y);
        }else {
            System.out.printf("%d/%d=%d...%d",x,y,x/y,x%y);
        }
    }
}
