package cn.practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class RandomDate {


    public static void main(String[] args) throws ParseException {
        Calendar c = Calendar.getInstance();
        c.set(2023,0,1,0,0,0);
        long ss = c.getTimeInMillis();
        long nn = System.currentTimeMillis();
        System.out.printf("10个 %tF %<tT 到 %tF %<tT之间的随机日期%n",ss,nn);
        for (int i = 10;i>0;i--){
            long t=Math.round(Math.random()*(nn-ss))+ss;
            System.out.printf("%tF %<tT%n",t);
        }

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date start = sdf.parse("2023-1-1 00:00:00");
        System.out.println(start.getTime());
        System.out.printf("%tF %<tT%n",start);
        System.out.printf("%tF %<tT%n",System.currentTimeMillis());
        Random rand = new Random();
        System.out.printf("10个 %tF %<tT 到 %tF %<tT之间的随机日期%n",start,System.currentTimeMillis());
        for (int i = 10;i>0;i--){
            long l= rand.nextLong(start.getTime(),System.currentTimeMillis()+1);
            System.out.printf("%tF %<tT%n",l);
        }
    }
}
