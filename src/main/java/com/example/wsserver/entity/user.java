package com.example.wsserver.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class user {
    @Id
    private String user;
    private String password;
    private String isadmin;
}
