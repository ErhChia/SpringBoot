package com.example.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * Entity for database "user_data"
 *
 * @author Jack Lin on 11/30/18
 */
@Data
@Entity
@Table(name = "user_data")
public class User {


    /**
     * 使用者ID
     * 序號自動增加
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_")
    private Integer id;

    /**
     * 使用者名稱
     */
    @Column(name = "name_")
    private String name;

    /**
     * 使用者密碼
     */
    @Column(name = "password_")
    private String password;

    /**
     * 帳號啟用狀態
     */
    @Column(name = "activate_")
    private Boolean activate;

    /**
     * 使用者性別
     */
    @Column(name = "gender_")
    private String gender;

    /**
     * 帳戶身分
     * <ul>
     * <li>0: admin</li>
     * <li>1: high permission user</li>
     * <li>2: normal user</li>
     * <li>99: disabled account/ banned account</li>
     * </ul>
     */
    @ManyToOne
    @JoinColumn(name = "user_role_id_")
    private UserRole userRoleId;

    @ManyToMany
    @JoinTable(
            name = "role_users",
            joinColumns = {@JoinColumn(name = "user_role_id_")},
            inverseJoinColumns = {@JoinColumn(name = "user_id_")},
            uniqueConstraints = @UniqueConstraint(
                    columnNames = {"user_role_id_", "user_id_"}
            )
    )
    private List<UserRole> userRoles;
}
