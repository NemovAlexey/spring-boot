package ru.kata.springboot.service;


import ru.kata.springboot.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findById(long id);
    void save(User user);
    void delete(long id);
}
