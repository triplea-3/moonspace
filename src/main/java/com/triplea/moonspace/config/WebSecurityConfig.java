package com.triplea.moonspace.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class WebSecurityConfig {
    @Bean
    public PasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeHttpRequests(
            request ->
                        request.requestMatchers("/auth", "/auth/**").hasAuthority("USER")
                        .requestMatchers("/admin", "/admin/**").hasAuthority("ADMIN")
                        .anyRequest().permitAll()
        ).formLogin(form -> form.loginPage("/login").defaultSuccessUrl("/auth/account"));

        return httpSecurity.build();
    }
}