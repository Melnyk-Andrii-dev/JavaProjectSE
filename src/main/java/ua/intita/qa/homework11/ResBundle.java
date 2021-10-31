package ua.intita.qa.homework11;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResBundle {

    public static void main(String[] args) {
//        Locale locale = Locale.ENGLISH
//        System.out.println(Locale.ENGLISH.getCountry());
       ResourceBundle bundle = ResourceBundle.getBundle("text_en", Locale.ENGLISH);
       System.out.println(bundle.getString("key1"));
        bundle = ResourceBundle.getBundle("text_de", Locale.GERMANY);
        System.out.println(bundle.getString("key2"));
        bundle = ResourceBundle.getBundle("text_fr", Locale.FRANCE);
        System.out.println(bundle.getString("key3"));
        bundle = ResourceBundle.getBundle("text_it", new Locale("it", "IT"));
        System.out.println(bundle.getString("key4"));
        bundle = ResourceBundle.getBundle("text_en", Locale.ENGLISH);
        System.out.println(bundle.getString("key4"));
    }

}
