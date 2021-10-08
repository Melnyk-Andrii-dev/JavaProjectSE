package ua.intita.qa.homework9;

public interface Statistics {
    int countNumberLetters(String word);        // метод возвращает количество букв в слове
    int countNumberVowels(String word);         // метод возвращает количество глассных букв в слове
    int countNumberConsonants(String word);     // метод возвращает количество согласных букв в слове
    int countPoints(String text);               // метод возвращает количество точек в тексте
    int countComas(String text);                // метод возвращает количество запятых в тексте
}
