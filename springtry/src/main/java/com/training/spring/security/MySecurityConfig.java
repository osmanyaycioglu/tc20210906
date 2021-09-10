package com.training.spring.security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.stereotype.Component;

@Component
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(final HttpSecurity httpParam) throws Exception {
        httpParam.authorizeRequests()
                 .antMatchers("/first/**")
                 .permitAll()
                 .anyRequest()
                 .authenticated()
                 .and()
                 .formLogin()
                 .disable()
                 .httpBasic();
    }

}
