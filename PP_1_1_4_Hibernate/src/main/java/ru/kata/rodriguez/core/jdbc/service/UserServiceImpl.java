package ru.kata.rodriguez.core.jdbc.service;

import ru.kata.rodriguez.core.jdbc.dao.UserDao;
import ru.kata.rodriguez.core.jdbc.dao.UserDaoHibernateImpl;
import ru.kata.rodriguez.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    private static final UserDao userDao = new UserDaoHibernateImpl();
    public void createUsersTable() {
        userDao.createUsersTable();
    }

    public void dropUsersTable() {
        userDao.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        userDao.saveUser(name, lastName, age);
    }

    public void removeUserById(long id) {
        userDao.removeUserById(id);
    }

    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    public void cleanUsersTable() {userDao.cleanUsersTable(); }
}
