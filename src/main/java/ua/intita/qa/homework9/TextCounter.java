package ua.intita.qa.homework9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextCounter implements Statistics{

    @Override
    public int countNumberLetters(String word) {
        Pattern pattern = Pattern.compile("[a-zA-Z]");
        Matcher matcher = pattern.matcher(word);
        int i = 0;
        while (matcher.find()){
            i++;
        }
        return i;
    }

    @Override
    public int countNumberVowels(String word) {
        Pattern pattern = Pattern.compile("[aAeEuUoOyYiI]");
        Matcher matcher = pattern.matcher(word);
        int i = 0;
        while (matcher.find()){
            i++;
        }
        return i;
    }

    @Override
    public int countNumberConsonants(String word) {
        Pattern pattern = Pattern.compile("[a-zA-Z&&[^aAeEuUoOyYiI]]");
        Matcher matcher = pattern.matcher(word);
        int i = 0;
        while (matcher.find()){
            i++;
        }
        return i;
    }

    @Override
    public int countPoints(String word) {
        Pattern pattern = Pattern.compile("[.]");
        Matcher matcher = pattern.matcher(word);
        int i = 0;
        while (matcher.find()){
            i++;
        }
        return i;
    }

    @Override
    public int countComas(String word) {
        Pattern pattern = Pattern.compile("[,]");
        Matcher matcher = pattern.matcher(word);
        int i = 0;
        while (matcher.find()){
            i++;
        }
        return i;
    }
}
