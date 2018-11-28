package com.example.bean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {
    @Test
    public void test(){
        User user = new User();
        ArrayList<User> users = new ArrayList<>();

        user.setUserId(0);
        user.setUserName("Alice");
        user.setPassword("aaa");
        user.setActivate(true);
        user.setGender(User.Gender.FEMALE);

        users.add(user);

        user = new User();
        user.setUserId(1);
        user.setUserName("Andrew");
        user.setPassword("abc123");
        user.setActivate(true);
        user.setGender(User.Gender.MALE);

        users.add(user);

        user = new User();
        user.setUserId(2);
        user.setUserName("Dick");
        user.setPassword("qwer");
        user.setActivate(false);
        user.setGender(User.Gender.MALE);

        users.add(user);

        users.forEach(System.out::println);
    }
}
