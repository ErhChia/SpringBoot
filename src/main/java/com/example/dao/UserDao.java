package com.example.dao;

import com.example.bean.User;

import java.util.List;

/**
 * @author Jack Lin on 11/29/18
 */
public interface UserDao {
    void create();
    void insert(User user);
    void delete(int id);
    void update(User user);
    List<User> find();
    User find(User user);
    User find(int id);
}
