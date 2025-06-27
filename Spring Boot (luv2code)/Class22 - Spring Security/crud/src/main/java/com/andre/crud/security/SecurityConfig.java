package com.andre.crud.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
    @Bean
    public InMemoryUserDetailsManager userDetailsManager() {
        UserDetails admin = User.builder().username("admin").password("{noop}admin123").roles("ADM", "EDITOR", "VIEWER").build();
        UserDetails editor = User.builder().username("editor").password("{noop}editor123").roles("EDITOR", "VIEWER").build();
        UserDetails viewer = User.builder().username("viewer").password("{noop}viewer123").roles("VIEWER").build();

        return new InMemoryUserDetailsManager(admin, editor, viewer);
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        http.authorizeHttpRequests(configurator -> configurator
                        .requestMatchers(HttpMethod.GET,"/api/employees").hasRole("VIEWER")
                        .requestMatchers(HttpMethod.GET, "/api/employees/**").hasRole("VIEWER")
                        .requestMatchers(HttpMethod.POST, "/api/employees").hasRole("EDITOR")
                        .requestMatchers(HttpMethod.PATCH, "/api/employees/**").hasRole("EDITOR")
                        .requestMatchers(HttpMethod.DELETE, "/api/employees/**").hasRole("ADM")
                );

        http.httpBasic(Customizer.withDefaults());
        http.csrf(csrf -> csrf.disable());

        return http.build();
    }
}
