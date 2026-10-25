package com.in28minutes.springsecurity.jwt;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JwtAuthResource {

    @PostMapping("/auth")
    public Authentication authentication(Authentication authentication) {
        return authentication;
    }

}
