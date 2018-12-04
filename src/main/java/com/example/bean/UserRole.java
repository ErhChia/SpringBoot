package com.example.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 儲存使用者帳戶身份的Entity
 * 不會做更動
 * <ul>
 * <li>0: admin</li>
 * <li>1: high permission user</li>
 * <li>2: normal user</li>
 * <li>99: disabled account/ banned account</li>
 * </ul>
 *
 * @author Jack Lin on 12/3/18
 */
@Data
@Entity(name = "user_role")
public class UserRole {

    /**
     * 使用者身份ID
     */
    @Column(name = "id_")
    @Id
    private int id;

    /**
     * 使用者帳戶身分
     */
    @Column(name = "role_")
    private String role;
}
