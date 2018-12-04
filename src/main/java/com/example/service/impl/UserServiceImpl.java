package com.example.service.impl;

import com.example.bean.User;
import com.example.repository.UserRepository;
import com.example.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * Implement of UserService
 *
 * @author Jack Lin on 11/29/18
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserRepository userRepository;

    @Override
    public void insert(User user) {
        userRepository.save(user);
    }

    @Override
    public void delete(User user) {
        Optional<User> target = userRepository.findById(user.getId());
        userRepository.delete(target.orElse(null));
    }

    @Override
    public void update(User user) {
        userRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findOne(User user) {
        Optional<User> target = userRepository.findById(user.getId());
        return target.orElse(null);
    }
}
