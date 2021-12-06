package qa.homework17;

import org.junit.Test;
import ua.intita.qa.homework17.animals.Pet;
import ua.intita.qa.homework17.animals.Shelter;

import java.util.Map;

public class ShelterTest {

    @Test
    public void testShelterCreation() {
        Shelter shelter = new Shelter();
        Map<String, Pet> petMap = shelter.inputPetsFromConsole();
        shelter.printAllPetsKeys(petMap);
        shelter.sortByName(petMap);
    }
}
