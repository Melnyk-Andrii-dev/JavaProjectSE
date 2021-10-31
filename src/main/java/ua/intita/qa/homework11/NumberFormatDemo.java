package ua.intita.qa.homework11;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo {
    public static void main(String[] args) {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.CANADA);
        System.out.println(numberFormat.format(100500100500L));
        numberFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println(numberFormat.format(1000));
    }
}
