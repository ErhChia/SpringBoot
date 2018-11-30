package com.example.repository;

import com.example.bean.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;


/**
 * @author Jack Lin on 11/30/18
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {
    @Resource
    private UserRepository repository;

    @Test
    public void testEntity() {

        List<User> users = repository.findAll();
        users.forEach(System.err::println);
        assertThat(users).isNotEmpty();

        users = repository.findByGender("Male");
        users.forEach(System.err::println);
        assertThat(users).isNotEmpty();

        users = repository.findByActivate(false);
        users.forEach(System.err::println);
        assertThat(users).isNotEmpty();

        System.err.println(repository.findByUserNameAndGender("Jessie", "Female"));

        System.err.println(repository.findByUserName("Alex"));
    }
}
