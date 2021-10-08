package ua.intita.qa.homework9;

import org.junit.Test;
import sun.jvm.hotspot.utilities.Assert;

import static org.junit.Assert.*;

public class TextEditorTest {

    final private TextEditor textEditor = new TextEditor();

    @Test
    public void uppercase() {
        String actual = textEditor.uppercase("QqwerQWEty");
        assertEquals(actual, "QQWERQWETY");
    }

    @Test
    public void lowercase() {
        String actual = textEditor.lowercase("QqwerQWEty");
        assertEquals(actual, "qqwerqwety");
    }

    @Test
    public void getLength() {
        int actual = textEditor.getLength("qwertyuiopasdfghjklzxcvbnmQWERTYUIOPLKJHGFDSAZXCVBNM1-");
        assertEquals(actual, 54);
    }

    @Test
    public void concat() {
        String actual = textEditor.concat("qwe","rty");
        assertEquals(actual, "qwerty");
    }

    @Test
    public void contain() {
        boolean actual = textEditor.contain("qwerty", 'q');
        assertTrue(actual);
        actual = textEditor.contain("qwerty", 'Q');
        assertFalse(actual);
    }
}