package com.xiangz.beta;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author nuc
 */
@SpringBootApplication(scanBasePackages = "com.xiangz.beta")
@MapperScan("com.xiangz.beta.dao")
public class BetaWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(BetaWebApplication.class, args);
    }
}