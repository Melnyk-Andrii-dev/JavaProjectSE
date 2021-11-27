package qa.homework16;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ua.intita.qa.homework16.Second.dao.EventDao;
import ua.intita.qa.homework16.Second.entity.Event;

import java.util.*;

public class SecondTest {
    EventDao eventDao = new EventDao();
    Event event1 = new Event();
    Event event2 = new Event();
    Event event3 = new Event();
    Event event1edited = new Event();
    HashMap<String, Event> collection;

    @Before
    public void setEventDao(){
        event1.setTitle("Black Friday");
        event1.setDate(new GregorianCalendar(2021, Calendar.NOVEMBER, 27));
        event1.setPlace("Megamoll");

        event2.setTitle("New Year");
        event2.setDate(new GregorianCalendar(2022, Calendar.JANUARY, 1));
        event2.setPlace("Home");

        event3.setTitle("Teambuilding");
        event3.setDate(new GregorianCalendar(2022, Calendar.MARCH, 14));
        event3.setPlace("Unknown");

        event1edited.setId(event1.getId());
        event1edited.setTitle("Black Friday");
        event1edited.setDate(new GregorianCalendar(2021, Calendar.NOVEMBER, 27));
        event1edited.setPlace("SkyPark");

        collection = new HashMap<>();
        collection.put(event1edited.getId(), event1edited);
        collection.put(event2.getId(), event2);
    }

    @Test
    public void eventDaoTest(){
        eventDao.save(event1);
        eventDao.save(event2);
        eventDao.save(event3);
        eventDao.delete(event3.getId());
        eventDao.save(event1edited);

        Assert.assertEquals(event2.getPlace(), eventDao.findById(event2.getId()).getPlace());
        Assert.assertNull(eventDao.findById(event3.getId()));
        Assert.assertEquals(collection.values().toString(), eventDao.findAll().toString());
    }
}
