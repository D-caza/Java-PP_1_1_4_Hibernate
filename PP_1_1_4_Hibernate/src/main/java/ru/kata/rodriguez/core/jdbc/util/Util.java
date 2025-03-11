package ru.kata.rodriguez.core.jdbc.util;

import ru.kata.rodriguez.core.jdbc.model.User;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Util {
    // реализуйте настройку соеденения с БД
    private static Configuration configuration = new Configuration().addAnnotatedClass(User.class);
    public static SessionFactory getSessionFactory() {return configuration.buildSessionFactory(); }
}