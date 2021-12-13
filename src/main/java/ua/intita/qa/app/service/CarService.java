package ua.intita.qa.app.service;

import ua.intita.qa.app.dao.CommonDao;
import ua.intita.qa.app.entity.User;

public class CarService {
    private CommonDao<User> commonDao;

    public CarService(CommonDao<User> commonDao) {
        this.commonDao = commonDao;
    }

//    public CarService() {
//        this.commonDao = new UserDao();
//    }

    //method
}
