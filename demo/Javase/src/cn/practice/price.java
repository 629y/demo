package cn.practice;

public class price {
    public static void main(String[] args) {
        //一件商品的单价从10.25元降了1.25元，而自己购买的数量由原来的两个增加到10个，
        // 可以使用复合赋值运算符来计算购买商品的总价。
        double commodity_price = 10.25;
        double total=0;
        //定义总价初始为0
        int count=2;
        commodity_price-=1.25;
        count*=5;
        //需购买10个，即原来数量的5倍
        total = commodity_price * count;
        System.out.printf("商品当前单价为：%4.2f\n",commodity_price);
        //4-有4位有效数字
        System.out.printf("购买商品数量为：%d\n",count);
        System.out.printf("总价为：%4.2f\n",total);
    }
}
