package com.example.learn.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfig {
  //  @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        //httpSecurity.csrf(false);
        httpSecurity.authorizeHttpRequests(auth-> auth.anyRequest());
        httpSecurity.httpBasic(Customizer.withDefaults());
       // httpSecurity.csrf().disable();
        return httpSecurity.build();
    }
}
