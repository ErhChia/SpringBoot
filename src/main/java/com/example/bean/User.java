package com.example.bean;

import lombok.Data;

import javax.persistence.*;

/**
 * Entity for database "user_data"
 * @author Jack Lin on 11/30/18
 */
@Data
@Entity(name = "user_data")
public class User {


    /**
     * 使用者ID
     * 序號自動增加
     */
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id_")
    private int userId;

    /**
     * 使用者名稱
     */
    @Column(name = "name_")
    private String userName;

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
}
