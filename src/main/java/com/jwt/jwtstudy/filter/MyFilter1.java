package com.jwt.jwtstudy.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

public class MyFilter1 implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("filter 1");

//        // 다운 캐스팅 : 상위 클래스로 전환되어있던것을 하위 클래스로 캐스팅 하는것
//        HttpServletRequest req = (HttpServletRequest) request;
//        HttpServletResponse rep = (HttpServletResponse) response;
//
//        if(req.getMethod().equals("POST")){
//            System.out.println("POST 요청됨");
//            String headerAuth = req.getHeader("Authorization");
//            System.out.println(headerAuth);
//        }
//        // security filter 를 만들어서 security config 클래스에 등록시켜야함
//        // 만드는 이유는 로그인 부분 설정을 위해서이고
//        // 강제로 로그인을 시켜 session에 등록 시키기 위해서이다
//        // JWT 로그인의 경우 세션은 사실 필요 없지만
//        // 권한관리를 보다 편하게 하기 위해서 세션에 등록시키는 것이다.
//        // 로그인하고 인증이 완료되면 return 된 PrincipalDetails (UserDetails) 가 세션에 등록되고
//        // 등록된 PrincipalDetails 객체를 가지고 JWT 토큰을 생성하여 로그인한 사용자에게 header에 담아서 보내주면 된다.

        chain.doFilter(request, response);
    }
}
