package dev.arcturuz.accountmanager.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain createFilter(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity.oauth2ResourceServer(oauth2 -> oauth2
                .jwt(jwt -> {})).build();
    }
}
