package com.jwt.jwtstudy.config.auth;


import com.jwt.jwtstudy.dao.UserDao;
import com.jwt.jwtstudy.entity.UserEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PrincipalDetailsService implements UserDetailsService {


    private final UserDao userDao;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserEntity userEntity = this.userDao.findByUsername(username);
        System.out.println("================ loadUserByUsername ================");
        System.out.println(userEntity);
        System.out.println("---------------- loadUserByUsername -----------------");

        return new PrincipalDetails(userEntity);
    }
}
