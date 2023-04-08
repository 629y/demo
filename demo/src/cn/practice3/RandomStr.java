package cn.practice3;

import java.util.Random;

public class RandomStr {
    public static void main(String[] args) {
        //随机生成如下表达式  12+345-678+9 = 100
        //1-23+5-6-7+89   12+345-678+9

        for (int i = 0; i < 10; i++) {
            System.out.println(getNums());
        }
    }
    public static String getNums() {
        Random rand = new Random();
        String[] os = {"", "-", "+"};
        StringBuilder s = new StringBuilder();
        for (int i = 1; i < 9; i++) {
            s.append(String.format("%d%s", i, os[rand.nextInt(os.length)]));
        }
        s.append("9");
        return s.toString();
    }

}
