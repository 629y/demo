package cn.practice3;

import java.util.Arrays;

public class StringGrouping {

        public static void main(String[] args) {
            //将一个字符串数组进行分组输出，每组中的字符串都由相同的字符组成。

            //举个例子：输入[“eat”,”tea”,”tan”,”ate”,”nat”,”bat”]
            //输出[[“ate”,”eat”,”tea”],[“nat”,”tan”],[“bat”]]

            String[] ls = new String[]{"age", "eat", "tea", "tan", "ate", "nat", "bat", "book", "bkoo"};
            System.out.println(Arrays.toString(ls));
            for (int n = 0; n < ls.length; n++) {
                String t = ls[n];
                if ("-".equals(t)) continue;
                for (int i = n + 1; i < ls.length; i++) {
                    if (is(t, ls[i])) {
                        ls[n] += "-" + ls[i];
                        ls[i] = "";
                    }
                }
            }
            System.out.println(Arrays.deepToString(ls));
            String ok = "";
            for (String t : ls) {
                if ("".equals(t) || "-".equals(t)) continue;
                ok += "," + t;
            }
            String[] oo = ok.substring(1).split(",");
            System.out.println(Arrays.toString(oo));
            StringBuilder su = new StringBuilder("[");
            for(String s : oo){
                String[] t = s.split("-");
                su.append(Arrays.toString(t)+",");
            }
            su.replace(su.lastIndexOf(","),su.lastIndexOf(",")+1,"]");
            System.out.println(su);
        }
        public static boolean is(String a, String b) {
            boolean f = false;
            if (a.length() == b.length()) {
                var aa = a.toCharArray();
                Arrays.sort(aa);
                var bb = b.toCharArray();
                Arrays.sort(bb);
                f = new String(aa).equalsIgnoreCase(new String(bb));
            }
            return f;
        }
        public static boolean isSame(String a, String b) {
            boolean f = true;
            if (a.length() == b.length()) {
                for (int i = 0; i < a.length(); i++) {
                    if (b.indexOf(a.charAt(i)) == -1) {
                        f = false;
                        break;
                    }
                }
                for (int i = 0; i < a.length(); i++) {
                    if (a.indexOf(b.charAt(i)) == -1) {
                        f = false;
                        break;
                    }
                }
            }
            return f;
        }
}

