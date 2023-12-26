package com.triplea.moonspace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class,
})
public class MoonSpaceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MoonSpaceApplication.class, args);
    }

}
