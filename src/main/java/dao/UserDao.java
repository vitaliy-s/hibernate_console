package dao;

import model.User;

import java.util.List;

/**
 * Created by vitaliy on 06.06.16.
 */
public interface UserDao {
    void addUser(User user);
    void deleteUser(User user);
    User getId(int id);
    List<User> allUser();

}
