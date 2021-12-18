package ua.intita.qa.homework16.Second.dao;

import ua.intita.qa.app.util.EventUtils;
import ua.intita.qa.homework16.Second.entity.EventOld;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EventDao implements CommonDao<EventOld> {
    static Map<String, EventOld> events = new HashMap<>();
    static{
        events.putAll(EventUtils.readDataFromFile("data/order.csv"));
    }

    @Override
    public EventOld save(EventOld event) {
        EventOld existed = events.get(event.getId());
        if (existed != null) {
            existed.setTitle(event.getTitle());
            existed.setDate(event.getDate());
            existed.setPlace(event.getPlace());
            event = existed;
        }
        events.put(event.getId(), event);
        return event;
    }

    public Map<String, EventOld> saveMap(Map<String, EventOld> map) {
        events.putAll(map);
        return map;
    }


    @Override
    public EventOld findById(String id) {
        return events.get(id);
    }

    @Override
    public Collection<EventOld> findAll() {
        return events.values();
    }

    @Override
    public void delete(String id) {
        events.remove(id);
    }
}
