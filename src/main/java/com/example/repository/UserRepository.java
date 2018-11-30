package com.example.repository;

import com.example.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Repository for database "user_data"
 *
 * @author Jack Lin on 11/30/18
 */
public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findByGender(String gender);

    List<User> findByActivate(Boolean activate);

    User findByUserNameAndGender(String name, String gender);

    User findByUserName(String name);
}
