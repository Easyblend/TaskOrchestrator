package com.example.TaskOrchestratorPro.config;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Configuration
public class TodoSecurity {

    @Value("${app.user.name}")
    private String appUser;

    @Value("${app.user.password}")
    private String appPassword;

    private static final Logger log = LoggerFactory.getLogger(TodoSecurity.class);

    @PostConstruct
    public void logCredentials() {
        log.info("Spring Security username: {}", appUser);
        log.info("Spring Security password: {}", appPassword);
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests(auth->
                        auth.requestMatchers(HttpMethod.GET, "/todo", "/todos/**").permitAll()
                                .anyRequest().authenticated()
                ).httpBasic(Customizer.withDefaults());

return http.build();
    }

    @Bean
    public UserDetailsService users() {
        UserDetails user = User.builder()
                .username(appUser)
                .password("{noop}" + appPassword)
                .roles("ADMIN")
                .build();
        return new InMemoryUserDetailsManager(user);
    }

}
