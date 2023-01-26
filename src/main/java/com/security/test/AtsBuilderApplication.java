package com.security.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(
        exclude = DataSourceAutoConfiguration.class // todo 현재 DB 를 안 붙여서 추가 필요
)
public class AtsBuilderApplication {

    public static void main(String[] args) {
        SpringApplication.run(AtsBuilderApplication.class, args);
    }

}
