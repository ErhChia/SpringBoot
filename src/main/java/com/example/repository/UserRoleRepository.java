package com.example.repository;

import com.example.domain.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Jack Lin on 12/4/18
 */
public interface UserRoleRepository extends JpaRepository<UserRole, Integer> {
}
