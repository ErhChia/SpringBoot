package com.example.service;

import com.example.domain.User;
import com.example.repository.UserRoleRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

/**
 * @author Jack Lin on 11/29/18
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional

public class UserServiceTest {

    @Resource
    private UserService userService;

    @Resource
    private UserRoleRepository userRoleRepository;

    @Test
    public void crudTest() {
        User target = new User();
        User result;

        target.setName("Dora");
        target.setPassword("qwerty");
        target.setGender("Female");
        target.setActivate(true);
        target.setUserRoleId(userRoleRepository.getOne(2));

        userService.insert(target);
        List<User> users = userService.findAll();

        assertThat(users).hasSize(7);
        users.forEach(System.err::println);

        target.setUserRoleId(userRoleRepository.getOne(1));
        userService.update(target);
        result = userService.findOne(target);
        assertThat(result).isNotNull();
        System.err.println(result);

        userService.delete(target);
        result = userService.findOne(target);
        assertThat(result).isNull();
        System.err.println(result);

        users = userService.findAll();
        assertThat(users).hasSize(6);
        users.forEach(System.err::println);
    }
}
