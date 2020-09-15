package com.goldcard.postgresql_demo1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@ComponentScan("com.goldcard")
@MapperScan(value="com.goldcard.postgresql_demo1.dao")
@EnableWebMvc
public class PostgresqlDemo1Application {

    public static void main(String[] args) {
        SpringApplication.run(PostgresqlDemo1Application.class, args);
    }

}
