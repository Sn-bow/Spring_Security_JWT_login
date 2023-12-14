package com.jwt.jwtstudy.controller;


import com.jwt.jwtstudy.dao.UserDao;
import com.jwt.jwtstudy.entity.UserEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class RestApiController {

    private final UserDao userDao;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @GetMapping("/home")
    public String home() {
        return "<h1>home</h1>";
    }

    @GetMapping("/test")
    public UserEntity findByUser() {
        return this.userDao.findByUsername("tester");
    }

    @PostMapping("/token")
    public String token() {
        return "<h1>token</h1>";
    }

    @PostMapping("/join")
    public String join(@RequestBody UserEntity user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setRole("ROLE_USER");
        userDao.save(user);
        return "회원가입 완료";
    }


    // user, manager, admin
    @GetMapping("/api/v1/user")
    public String user() {
        return "user";
    }

    // manager, admin
    @GetMapping("/api/v1/manager")
    public String manager() {
        return "manager";
    }

    // admin
    @GetMapping("/api/v1/admin")
    public String admin() {
        return "admin";
    }
}
