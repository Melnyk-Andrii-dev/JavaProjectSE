package ua.intita.qa.homework11;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class DateFormatDemo {
    public static void main(String[] args) throws ParseException {
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, Locale.ENGLISH);
        System.out.println(dateFormat.format(new Date()));
        dateFormat = DateFormat.getTimeInstance(DateFormat.FULL, Locale.getDefault());
        System.out.println(dateFormat.format(new Date()));
    }
}
