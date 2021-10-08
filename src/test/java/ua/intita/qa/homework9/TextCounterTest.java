package ua.intita.qa.homework9;

import org.junit.Test;

import static org.junit.Assert.*;

public class TextCounterTest {
    final private TextCounter textCounter = new TextCounter();

    @Test
    public void countNumberLetters() {
        int actual = textCounter.countNumberLetters("qwertyuiop");
        assertEquals(10, actual);
    }

    @Test
    public void countNumberVowels() {
        int actual = textCounter.countNumberVowels("QwErTYUIoAA");
        assertEquals(7, actual);
    }

    @Test
    public void countNumberConsonants() {
        int actual = textCounter.countNumberConsonants("QwErTYUIoAA");
        assertEquals(4, actual);
    }

    @Test
    public void countPoints() {
        int actual = textCounter.countPoints("Q,.wEr.TYUIoAA.,");
        assertEquals(3, actual);
    }

    @Test
    public void countComas() {
        int actual = textCounter.countComas("Q,.wEr.TYUIoAA.,");
        assertEquals(2, actual);
    }
}