package ua.intita.qa.homework9;

interface Handler {
    String uppercase(String word);              // метод переводит слово в верхний регистр
    String lowercase(String word);              // метод переводит слово в нижний регистр
    int getLength(String word);                 // метод возвращает длину слова
    String concat(String str1, String str2);    // метод обьединяет две строки в одну
    boolean contain(String word, char symbol);  // метод возвращает true если в слове есть такая буква
}
