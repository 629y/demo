package cn.practice;

public class Random1 {
    public static void main(String[] args) {
        //1 java.lang.Math random()方法-------------------------
        for (int i = 0; i < 5; i++) {
        //java.lang.Math类年 random()方法，是返回大于0 小于1的随机小数(double)
            System.out.println(Math.random());
        }

        //随机布尔
        boolean f = Math.random() > .5;
        System.out.println(f);

        //有10个学生，随机抽一个幸运学生 数组下载是10 0 - 9
        var sts = new String[]{"李四", "张三", "李丽丽", "张三丰", "赵六", "李勇", "王五", "周强", "郑国", "赵飞飞"};
        //利用Math.random() 随机小数 ，Math.round() 方法，获取随机范围数字 0 - 9
        int index = (int)Math.round(Math.random()*9);
        //0.000001 * 9 = 0.00009 四舍五入取整 0
        //0.999999 * 9
        //System.out.println(.999*9);
        System.out.println(sts.length);
        System.out.printf("幸运学生：%s%n",sts[index]);

        //1 四舍五入取整数，返回long类型的整数
        System.out.println(Math.round(.555));

        //0
        System.out.println(Math.round(.444));

        //0
        System.out.println(Math.round(.111));

        //0
        System.out.println(Math.round(.009));

        //1
        System.out.println(Math.round(1.2));
    }
}
