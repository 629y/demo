package cn.process;
/**
 * <p>Description:百钱百鸡算法</p>
 * <p>鸡翁一只五钱，鸡母一只三钱，鸡雏三只一钱。百钱买百鸡，问鸡翁、鸡母、鸡雏各几何</p>
 * <p>利用三层循环-4个答案</p>
 * <p>Class:HundredChickens</p>
 * <p>Powered by zxy On 2023-04-11 19:36  </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class HundredChickens {
    public static void main(String[] args) {
        //计算百钱百鸡-用判断语句
        //利用三层循环-4个答案
        //鸡翁一只五钱，鸡母一只三钱，鸡雏三只一钱。百钱买百鸡，问鸡翁、鸡母、鸡雏各几何
        //方法一
        for(int a = 0;a<=20;a++){
             for (int b = 0;b<=33;b++){
                 for (int c = 0;c<=100;c++){
                     if (c%3!=0){continue;}
                     int s1 = a+b+c;
                     int s2 = a*5+b*3+c/3;
                     if (s1 == 100 && s2 == 100){
                         System.out.printf("%d %d %d%n",a,b,c);
                     }
                 }
             }
        }
        //方法二
        for (int x=0;x<=20;x++){
            for (int y=0;y<=33;y++){
                for (int z=0;z<=100;z+=3){
                    if (x+y+z==100&&x*5+y*3+z/3==100){
                        System.out.printf("%d %d %d%n",x,y,z);
                    }
                }
            }
        }
    }
}
