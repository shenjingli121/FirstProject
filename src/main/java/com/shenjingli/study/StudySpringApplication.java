package com.shenjingli.study;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@MapperScan("com.mapper")
@SpringBootApplication
@EnableScheduling
public class StudySpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(StudySpringApplication.class, args);
    }
}
