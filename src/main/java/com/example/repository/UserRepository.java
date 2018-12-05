package com.example.repository;

import com.example.domain.User;
import com.example.domain.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Repository for database "user_data"
 *
 * @author Jack Lin on 11/30/18
 */
public interface UserRepository extends JpaRepository<User, Integer> {

    /**
     * 尋找所有和gender性別相同的資料
     *
     * @param gender
     * @return
     */
    List<User> findByGender(String gender);

    /**
     * 尋找所有啟用或非啟用的帳戶資料
     *
     * @param activate
     * @return
     */
    List<User> findByActivate(Boolean activate);

    /**
     * 尋找符合userRole list 的使用者
     *
     * @param userRole
     * @return
     */
    User findByUserRoles(List<UserRole> userRole);
}
