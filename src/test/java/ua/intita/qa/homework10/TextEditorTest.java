package ua.intita.qa.homework10;

import org.junit.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class TextEditorTest {

    TextEditor textEditor = new TextEditor();

    @Test(dataProvider = "text1", dataProviderClass = TestData.class)
    public void orderWordsTest (String input1) {
      //  System.out.println(Arrays.toString(textEditor.orderWords(input1)));
        Assert.assertEquals("[Download, If, Java, Java, Java, Java, Java, Java, Once," +
                " Please, SE, So, a, and, and, are, available, based, below, correct, directories," +
                " download, download, download, environment, environment, environmentJava, exe, follow," +
                " for, freely, from, guides, have, how, install, installation, installed, instructions," +
                " is, language, link, machine, machine, machine, mentioned, need, on, on, on, on, on," +
                " operating, point, programming, run, section, set, set, set, set, steps, still," +
                " systemFollow, the, the, the, the, the, then, this, to, to, to, to, to, to, to, to," +
                " up, up, up, variables, version, willing, would, you, you, you, you, you, your, your," +
                " your, your, your]", Arrays.toString(textEditor.orderWords(input1)));
    }

    @Test(dataProvider = "text1", dataProviderClass = TestData.class)
     public void deleteWordsTest(String input1){
       // System.out.println(textEditor.deleteWords(input1, 4));
        Assert.assertEquals("If you are still willing to set up your environment for programming " +
                "language, this section guides on how to download and set up on your machine. Please follow" +
                " the steps mentioned below to set up the environment. SE is freely available the Download" +
                "  So you download a version based on your operating system.\n" +
                "Follow the instructions to download and run the exe to install on your machine. \n" +
                "Once you installed on your machine would to set environment variables to point to correct \n" +
                "installation directories.", textEditor.deleteWords(input1, 4));
        Assert.assertNull(textEditor.deleteWords(input1, 0));
     }
}
