package com.example.service;

import com.example.domain.User;

import java.util.List;

/**
 * Service of User
 *
 * @author Jack Lin on 11/29/18
 */

public interface UserService {

    /**
     * 將user插入至Entity
     *
     * @param user
     */
    void insert(User user);

    /**
     * @param user
     */
    void delete(User user);

    void update(User user);

    List<User> findAll();

    User findOne(User user);
}
