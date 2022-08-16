package com.example.demo.config;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;

@ConfigurationProperties(prefix = "config")
@Data
public class AuthorizationProperties {

    private Map<String, UserProperties> users;

    @Data
    public static class UserProperties {
        private String url;
        private String passcode;
        private  String password;
        private String email;
    }
}
