package com.etz.keycloaklearn.config;

import org.keycloak.adapters.springboot.KeycloakSpringBootConfigResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * KeyCloakConfig
 */
@Configuration
public class KeyCloakConfig {
    @Bean
    public KeycloakSpringBootConfigResolver keycloackBootConfigResolver() {
        return new KeycloakSpringBootConfigResolver();
    }

}