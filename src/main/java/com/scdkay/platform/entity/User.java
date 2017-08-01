package com.scdkay.platform.entity;

import java.io.Serializable;

public class User implements Serializable{
    private Integer id;

    private String userName;

    private String password;

    private String name;

    private String phoneNum;

    private Integer status;

    public User(Integer id, String userName, String password, String name, String phoneNum, Integer status) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.phoneNum = phoneNum;
        this.status = status;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum == null ? null : phoneNum.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}