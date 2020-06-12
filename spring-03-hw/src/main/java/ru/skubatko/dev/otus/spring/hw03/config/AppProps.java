package ru.skubatko.dev.otus.spring.hw03.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "app")
public class AppProps {

    private String quiz;
}
