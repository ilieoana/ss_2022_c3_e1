package com.example.ss_2022_c3_e1.config.security.providers;

import com.example.ss_2022_c3_e1.config.security.authentication.CustomAuthentication;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {

    @Value("${our.very.very.very.secret.key}")
    private String key;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        CustomAuthentication ca = (CustomAuthentication) authentication;
        String headerKey = ca.getKey();
        if (key.equals(headerKey)) {
            return new CustomAuthentication(null, true);
        }
        throw new BadCredentialsException("Oh No!");
    }

    @Override
    public boolean supports(Class<?> authentication) { // for which kind of authentication is this provider
        return CustomAuthentication.class.equals(authentication);
    }
}