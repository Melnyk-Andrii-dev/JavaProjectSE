package qa.homework16;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ua.intita.qa.homework16.Second.dao.EventDao;
import ua.intita.qa.homework16.Second.entity.Event;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.*;

public class SecondTest {
    EventDao eventDao = new EventDao();
    Event event1 = new Event();
    Event event2 = new Event();
    Event event3 = new Event();
    Event event1edited = new Event();
    HashMap<String, Event> collection;
    HashMap<String, Event> mapCsv;


    @Before
    public void setEventDao() {
//        event1.setTitle("Black Friday");
////        event1.setDate(new GregorianCalendar(2021, Calendar.NOVEMBER, 27));
//        event1.setPlace("Megamoll");
//
//        event2.setTitle("New Year");
////        event2.setDate(new GregorianCalendar(2022, Calendar.JANUARY, 1));
//        event2.setPlace("Home");
//
//        event3.setTitle("Teambuilding");
////        event3.setDate(new GregorianCalendar(2022, Calendar.MARCH, 14));
//        event3.setPlace("Unknown");
//
//        event1edited.setId(event1.getId());
//        event1edited.setTitle("Black Friday");
////        event1edited.setDate(new GregorianCalendar(2021, Calendar.NOVEMBER, 27));
//        event1edited.setPlace("SkyPark");
//
//        collection = new HashMap<>();
//        collection.put(event1edited.getId(), event1edited);
//        collection.put(event2.getId(), event2);
    }

//    @Before
//    public void initEventDaoFromCsv() {
//        String line = null;
//        List<String> strings;
//        String id;
//        String title;
//        LocalDateTime date;
//        String place;
//        mapCsv = new HashMap<>();
//        try (BufferedReader br = new BufferedReader(new FileReader("data/order.csv"))) {
//            while ((line = br.readLine()) != null) {
//                strings = Arrays.asList(line.split(","));
//                id = strings.get(0);
//                title = strings.get(1);
//                date = LocalDateTime.of(Integer.parseInt(strings.get(2)), Integer.parseInt(strings.get(3)),
//                        Integer.parseInt(strings.get(3)), Integer.parseInt(strings.get(5)),
//                        Integer.parseInt(strings.get(6)), Integer.parseInt(strings.get(7)));
//                place = strings.get(8);
//                mapCsv.put(id, new Event(id, title, date, place));
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

//    @Test
//    public void eventDaoTestFromCsv() {
//        eventDao.saveMap(mapCsv);
//        Assert.assertTrue(eventDao.findAll().containsAll(mapCsv.values()));
//    }


    @Test
    public void eventDaoTest() {
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