package com.jwt.jwtstudy.config.jwt;

public interface JwtProperties {
    String SECRET = "cos";
    int EXPIRATIONNN_TIME = 60000 * 20;
    String TOKEN_PREFIX = "Bearer ";
    String HEADER_STRING = "Authorization";
}
