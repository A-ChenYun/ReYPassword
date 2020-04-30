package com.achen.pass;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.achen.pass.dao")
@SpringBootApplication
public class PassApplication {

    public static void main(String[] args) {
        SpringApplication.run(PassApplication.class, args);
    }

}
