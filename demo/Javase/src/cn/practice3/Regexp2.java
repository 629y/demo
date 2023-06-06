package cn.practice3;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexp2 {
    public static void main(String[] args) {
        int i = 0;
        int n = 0;
        int t = 0;
        while (true) {
            ++t;
            String s = getNums();
            if (isOk(s)) {
                System.out.printf("%s=100(循环%d次)%n", s, t);
                ++i;
                n += t;
                t = 0;
            }
            if (i >= 11) break;
        }
        System.out.println(n);
    }

    public static boolean isOk(String str) {
        Pattern p = Pattern.compile("-?\\d+");
        Matcher m = p.matcher(str);
        int sum = 0;
        while (m.find()) {
            String t = m.group();
            sum += Integer.parseInt(t);
        }
        return sum == 100;
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
