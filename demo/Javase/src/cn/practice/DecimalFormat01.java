package cn.practice;

import java.text.DecimalFormat;

/**
 * <p>Description:整数（123）、定点数（123.4）、科学计数法（1.23E4)，百分比</p>
 * <p>Class:DecimalFormat</p>
 * <p>Powered by zxy On 2023-04-10 20:26  </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class DecimalFormat01 {
    public static void main(String[] args) {
        double d=156.22359646;
        System.out.println(new DecimalFormat("0").format(d));
        //156-被格式化的数值位数够，则取所有整数
        System.out.println(new DecimalFormat("#").format(d));
        //156-被格式化的数值位数够，则取所有整数
        System.out.println(new DecimalFormat("00000.###").format(d));
        //00156.224-被格式化的数值位数不够，则整数位不够的补零
        System.out.println(new DecimalFormat("#.######\u2030").format(d));
        System.out.println(new DecimalFormat("#.######‰").format(d));
        //156223.59646‰-以千分比方式计数并且保留6位小数
        System.out.println(new DecimalFormat("#.##%").format(d));
        //15622.36%-以百分比方式计数并且保留2位小数

        long c=4673568;
        System.out.println(new DecimalFormat("#.#####E00").format(c));
        //4.67357E06-显示为科学计算法，并保留5为小数且被格式化的数值位数不够，不够的补零
        System.out.println(new DecimalFormat("00.####E0").format(c));
        //46.7357E5-显示为科学计数法，并保留2位整数，4位小数
        System.out.println(new DecimalFormat("####,###").format(c));
        //4,673,568-毎三位用逗号分隔
        System.out.println(new DecimalFormat("数据分隔后为,##大小").format(c));
        //数据分隔后为4,67,35,68大小
    }
}
