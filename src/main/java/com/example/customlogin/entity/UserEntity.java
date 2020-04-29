package com.example.customlogin.entity;


import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String login;
    private String password;
    private String userName;

    public UserEntity() {
    }

    public UserEntity(String login, String password, String userName) {
        this.login = login;
        this.password = password;
        this.userName = userName;
    }
}
