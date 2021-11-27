package qa.homework16;

import org.junit.Assert;
import org.junit.Test;
import ua.intita.qa.homework16.First;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class FirstTest {
    First first = new First();

    @Test
    public void testStringToList(){
        List<String> list = first.stringToList("Lorem ipsum dolor sit amet");
        Assert.assertArrayEquals(new String[]{"Lorem", "ipsum", "dolor", "sit", "amet"}, list.toArray());
    }

    @Test
    public void testCountDuplicated(){
        Assert.assertEquals("[one=3, two=2, three=1]",
                first.countDuplicates(new ArrayList<String>
                        (Arrays.asList("one", "two", "one", "three", "two", "one"))).entrySet().toString());
    }
}
