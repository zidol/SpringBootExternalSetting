package me.zidol.springinit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@Profile("test")
public class TestConfiguration {
    @Bean
    public String hello() {
        return "hello";
    }
}
