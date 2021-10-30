package ua.intita.qa.homework11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        long future = date.getTime() + 100000;
        Date date1 = new Date(future);
        System.out.println(date.before(date1));
        System.out.println(date.getHours() + ":" + date.getMinutes());
        SimpleDateFormat formater = new SimpleDateFormat("yyyy---MM---dd");
        System.out.println(formater.format(new Date()));
    }
}
