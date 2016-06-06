package factory;

import dao.UserDao;
import impl.UserDaoImpl;

/**
 * Created by vitaliy on 06.06.16.
 */
public class Factory {
    public static Factory instance = new Factory();
    public UserDao userDao;

    private Factory(){}

    public static Factory getInstance(){
        return Factory.instance;
    }

    public UserDao getUserDao(){
        if (userDao == null){
            userDao = new UserDaoImpl();
            return userDao;
        }
       return null;
    }
}
