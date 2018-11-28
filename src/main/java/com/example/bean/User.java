package com.example.domain;

public class User {
    private int userId;
    private String userName;
    private String password;
    private Boolean activate;
    public enum Gender{MALE,FEMALE}
    private Gender gender;
    private String genderString;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getActivate() {
        return activate;
    }

    public void setActivate(Boolean activate) {
        this.activate = activate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
        switch (gender){
            case FEMALE:
                genderString = "Female";
                break;
            case MALE:
                genderString = "Male";
                break;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", activate=" + activate +
                ", gender=" + genderString +
                '}';
    }
}
