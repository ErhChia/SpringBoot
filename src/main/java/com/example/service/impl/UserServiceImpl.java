package com.example.service.impl;

import com.example.bean.User;
import com.example.dao.UserDao;
import com.example.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Jack Lin on 11/29/18
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao dao;

    @Override
    public void create() {
        dao.create();
    }

    @Override
    public void insert(User user) {
        dao.insert(user);
    }

    @Override
    public void delete(int id) {
        dao.delete(id);
    }

    @Override
    public void update(User user) {
        dao.update(user);
    }

    @Override
    public List<User> find() {
        return dao.find();
    }

    @Override
    public User find(User user) {
        return dao.find(user);
    }

    @Override
    public User find(int id) {
        return dao.find(id);
    }
}
