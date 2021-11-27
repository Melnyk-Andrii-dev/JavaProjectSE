//package ua.intita.qa.app.dao;
//
//import ua.intita.qa.app.entity.User;
//
//import java.util.Collection;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class UserDao implements CommonDao<User>{
//    private final Map<String, User> users = new HashMap<>();
//
//    @Override
//    public User save(User user) {
//        final User result = users.get(user.getUserId());
//        if(result != null){
//            result.setName(user.getName());
//            result.setSurname(user.getSurname());
//            result.setEmail(user.getEmail());
//        }
//        users.put(user.getUserId(), user);
//        return null;
//    }
//
//    @Override
//    public Collection<User> findById(String id) {
//        return (Collection<User>) users.get(id);
//    }
//
//    @Override
//    public Collection<User> findAll() {
//        return users.values();
//    }
//
//    @Override
//    public void delete(String id) {
//        users.remove(id);
//    }
//}
