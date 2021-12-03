package com.omfgdevelop.tinycloud.config;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@RequiredArgsConstructor
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Value("${app.security.enabled}")
    private boolean securityEnabled;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        if (securityEnabled) {
            http.csrf().disable();
        }else
        http.csrf().disable();

    }
}
