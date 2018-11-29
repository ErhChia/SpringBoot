package com.example.service;

import com.example.bean.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Jack Lin on 11/29/18
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Resource
    UserService userService;

    @Test
    public void crudTest(){
        userService.create();
        User user = new User();

        user.setUserId(0);
        user.setUserName("Alice");
        user.setPassword("aaa");
        user.setActivate(true);
        user.setGender("Female");

        userService.insert(user);

        user.setUserId(1);
        user.setUserName("Andrew");
        user.setPassword("abc123");
        user.setActivate(true);
        user.setGender("Male");

        userService.insert(user);

        User target = userService.find(user);
        assertThat(target).isNotNull();
        System.err.println(target);

        List<User> data = userService.find();

        assertThat(data).isNotNull();
        System.err.println(data);

        userService.delete(1);
        assertThat(userService.find()).hasSize(1);

        user.setUserId(0);
        user.setUserName("Alice");
        user.setPassword("abc123");
        user.setActivate(true);
        user.setGender("Female");
        userService.update(user);

        System.err.println(userService.find(0));
    }
}
