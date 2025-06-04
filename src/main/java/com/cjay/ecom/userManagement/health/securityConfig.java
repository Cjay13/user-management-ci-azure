package com.cjay.ecom.userManagement.health;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class securityConfig {
    
    @SuppressWarnings({ "removal", "deprecation" })
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeRequests(auth -> auth
                .requestMatchers("/cjayecom/v1/user/healthz").permitAll()
                .anyRequest().authenticated()
            )
            .httpBasic().and()
            .csrf().disable();

        return http.build();
    }
}
