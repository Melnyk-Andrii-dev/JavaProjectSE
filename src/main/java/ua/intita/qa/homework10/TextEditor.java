package ua.intita.qa.homework10;

import java.util.Arrays;
import java.util.regex.Pattern;

public class TextEditor {

    public String[] orderWords(String text) {
        text = text.replaceAll("[\\W &&[^ ]]", "");
        String[] strings = text.split("\\s");
        Arrays.sort(strings);
        return strings;
    }

    public String deleteWords(String text, int length) {
        //Pattern pattern = Pattern.compile("^[qwrtpsdfghjklzxcvbnm]\\w {" + length + "}");
       // Pattern pattern = Pattern.compile("^\\s*[qwrtpsdfghjklzxcvbnm]\\w{2}");
       // System.out.println("QQQ" + pattern.toString());
        if (length<=0){
            return null;
        }
        text = text.replaceAll("(\\W|^)[^eyuioaEYUIOA]\\w{" + (length-1) + "}(\\W|$)", " ");
        return text;
    }
}
