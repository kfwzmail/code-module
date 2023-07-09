package com.module;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author wjw
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class CodeModuleSpringbootApplication {
    public static void main(String[] args) {
        SpringApplication.run(CodeModuleSpringbootApplication.class, args);
    }
}
