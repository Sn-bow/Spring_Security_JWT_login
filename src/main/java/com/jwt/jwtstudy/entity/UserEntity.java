package com.jwt.jwtstudy.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

@Getter
@Setter
@ToString
public class UserEntity {

        int id;
        String email;
        String password;
        String username;
        String role;
        Timestamp createDate;

}
