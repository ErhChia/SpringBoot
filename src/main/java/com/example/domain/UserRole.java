package com.example.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 儲存使用者帳戶身份的Entity
 * 不會做更動
 *
 * @author Jack Lin on 12/3/18
 */
@Data
@Entity
@Table(name = "user_role")
public class UserRole {

    /**
     * 使用者身份ID
     */
    @Column(name = "id_")
    @Id
    private Integer id;

    /**
     * 使用者帳戶身分
     */
    @Column(name = "role_")
    private String role;
}
