import dao.UserDao;
import factory.Factory;
import model.User;

import java.util.List;

/**
 * Created by vitaliy on 06.06.16.
 */
public class Main {
    public static void main(String[] args) {

        Factory factory = Factory.getInstance();
        UserDao userDao = factory.getUserDao();
     //   UserDao userDao = new UserDaoImpl();

       /* User user1 = new User("vetal1515", "vetalll", "123456");
        userDao.addUser(user1);*/

        userDao.deleteUser(userDao.getId(55));

        List<User> userList = userDao.allUser();

        for (User user : userList){
            System.out.println(user.getId() + " - " + user.getName() + " - " + user.getMail());
        }

    }
}
