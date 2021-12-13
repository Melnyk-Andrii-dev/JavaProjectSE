package ua.intita.qa.homework16.Second.dao;

import ua.intita.qa.app.util.EventUtils;
import ua.intita.qa.homework16.Second.entity.Event;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EventDao implements CommonDao<Event> {
    static Map<String, Event> events = new HashMap<>();
    static{
        events.putAll(EventUtils.readDataFromFile("data/order.csv"));
    }

    @Override
    public Event save(Event event) {
        Event existed = events.get(event.getId());
        if (existed != null) {
            existed.setTitle(event.getTitle());
            existed.setDate(event.getDate());
            existed.setPlace(event.getPlace());
            event = existed;
        }
        events.put(event.getId(), event);
        return event;
    }

    public Map<String, Event> saveMap(Map<String, Event> map) {
        events.putAll(map);
        return map;
    }


    @Override
    public Event findById(String id) {
        return events.get(id);
    }

    @Override
    public Collection<Event> findAll() {
        return events.values();
    }

    @Override
    public void delete(String id) {
        events.remove(id);
    }
}
