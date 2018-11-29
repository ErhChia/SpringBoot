package com.example.bean;

import lombok.Data;

@Data
public class User {
    private int userId;
    private String userName;
    private String password;
    private Boolean activate;
    private String gender;
}
