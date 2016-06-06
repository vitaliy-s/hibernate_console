package impl;

import dao.UserDao;
import model.User;
import org.hibernate.Session;
import util.HiberSessionFact3;

import java.util.List;

/**
 * Created by vitaliy on 06.06.16.
 */
public class UserDaoImpl implements UserDao {

  //  Session session = HiberSessionFact3.getSessionFactory().openSession();

    public void addUser(User user) {

        Session session = HiberSessionFact3.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        session.close();
    }

    public void deleteUser(User user) {

        Session session = HiberSessionFact3.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(user);
        session.getTransaction().commit();
        session.close();

    }

    public User getId(int id) {
        Session session = HiberSessionFact3.getSessionFactory().openSession();
        User user = (User) session.load(User.class, id);
        session.close();
        return user;
    }

    public List<User> allUser() {
        List<User> userList = null;
        Session session = null;

        try {
            session = HiberSessionFact3.getSessionFactory().openSession();
            userList = session.createCriteria(User.class).list();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if ((session != null) && (session.isOpen())){
                session.close();
            }
        }
        return userList;
    }
}
