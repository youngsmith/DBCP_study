package com.example.demo.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "datasource")
@Getter
@Setter
public class DBProperties {
    private String driverClassName;
    private String url;
    private String username;
    private String password;
}
