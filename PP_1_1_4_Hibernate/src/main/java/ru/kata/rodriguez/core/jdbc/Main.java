package ru.kata.rodriguez.core.jdbc;

import ru.kata.rodriguez.core.jdbc.service.UserService;
import ru.kata.rodriguez.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();

        userService.saveUser("Antonio", "Banderas", (byte) 64);
        userService.saveUser("Jessica", "Chastain", (byte) 47);
        userService.saveUser("Bill", "Hader", (byte) 46);
        userService.saveUser("Jose", "Preysler", (byte) 25);
        userService.saveUser("Anna", "Castillo", (byte) 31);

        userService.removeUserById(2);

        userService.getAllUsers();

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
