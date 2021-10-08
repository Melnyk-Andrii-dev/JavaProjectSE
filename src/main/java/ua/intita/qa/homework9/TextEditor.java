package ua.intita.qa.homework9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextEditor implements Handler{
    @Override
    public String uppercase(String word) {
//        Pattern pattern = Pattern.compile("[\\S]");
//        Matcher matcher = pattern.matcher(word);
//        int x = 0;
//        while (matcher.find()){
//            x++;
//        }
        char temp;
        StringBuilder stringBuilder = new StringBuilder(word);
        for (int i = 0; i < stringBuilder.length(); i++) {
            if(stringBuilder.charAt(i)>(int)'`'){
                temp = (char)(stringBuilder.charAt(i)-32);
                stringBuilder.deleteCharAt(i);
                stringBuilder.insert(i, temp);
            }
        }
        System.out.println(stringBuilder);
        return stringBuilder.toString();
    }

    @Override
    public String lowercase(String word) {
        char temp;
        StringBuilder stringBuilder = new StringBuilder(word);
        for (int i = 0; i < stringBuilder.length(); i++) {
            if(stringBuilder.charAt(i)<(int)'`'){
                temp = (char)(stringBuilder.charAt(i)+32);
                stringBuilder.deleteCharAt(i);
                stringBuilder.insert(i, temp);
            }
        }
        System.out.println(stringBuilder);
        return stringBuilder.toString();

    }

    @Override
    public int getLength(String word) {
        return new StringBuilder(word).length();
    }

    @Override
    public String concat(String str1, String str2) {
        return str1+str2;
    }

    @Override
    public boolean contain(String word, char symbol) {
        StringBuilder stringBuilder = new StringBuilder(word);
        for (int i = 0; i < stringBuilder.length(); i++) {
            if(stringBuilder.charAt(i)==(int)symbol){
                return true;
            }
        }
        return false;
    }
}
