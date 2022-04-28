package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService {
    List<User> allUsers();

    void add(User user);

    void delete(Long id);

    User getUserById(Long id);

    void update(User user);

    User getUserByName(String name);

    void changeUser( Long[] selectedRoleId, User user);
    void saveNewUser(Long[] selectedRoleId, User user);
}

