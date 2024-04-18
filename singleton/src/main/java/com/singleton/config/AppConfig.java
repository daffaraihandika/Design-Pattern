package com.singleton.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.singleton.manager.DatabaseManager;

@Configuration
public class AppConfig {
    @Bean
    public DatabaseManager databaseManager() {
        return DatabaseManager.getInstance();
    }
}
