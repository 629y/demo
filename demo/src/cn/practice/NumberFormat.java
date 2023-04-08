package cn.practice;

public class NumberFormat {
    public static void main(String[] args) {
//        int a = 1424248;
//        float b = .5F;
//        int c = 3;
//        System.out.printf("%03d %d %.3f%n", c, a, b);
//
//        //格式化货币
//        NumberFormat nf1 = NumberFormat.getCurrencyInstance();
//        assert nf1 != null;
//        nf1.setMinimumFractionDigits();
//        System.out.println(nf1.format(a));
//        NumberFormat nf2 = NumberFormat.getCurrencyInstance();
//        System.out.println(nf2.format(a));
//        int n1 = 0;
//        int n2 = 0;
//        //创建一个数值格式化对象
//        NumberFormat nf = NumberFormat.getInstance();
//        //设置精确到小数点后2位
//        nf.setMaximumFractionDigits(2);
//        String res1;
//        if(n2 == 0){
//        //除数不能为0
//            res1 = "0";
//        }else{
//            res1 = nf.format((int) ((float) n1 / (float) n2 * 100));
//        }
//        System.out.println("百分比为：" + res1 + "%");
    }

    private void setMaximumFractionDigits(int i) {
    }

    private static NumberFormat getInstance() {
        return null;
    }

    private String format(int a) {
        return null;
    }

    private void setMinimumFractionDigits() {
    }

    private static NumberFormat getCurrencyInstance() {
        return null;
    }
}
