package ua.intita.qa.app.dao;

import java.util.Collection;
import java.util.List;

public interface CommonDao <T>{
    T save(T entity);
    T findById(String id);
    Collection<T> findAll();
    void delete(String id);
}
