package qa.app.dao;

import java.util.List;

public interface CommonDao <T>{
    T save(T entity);
    T findById(String id);
    List<T> findAll();
    void delete(String id);
}
