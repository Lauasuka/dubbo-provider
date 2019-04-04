package io.amoe.service;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Mr.Amoe
 * @project dubbo-provider
 * @date 2019/4/2 11:34
 */
@SpringBootApplication
@MapperScan(basePackages = "io.amoe.dao")
@EnableDubbo(scanBasePackages = "io.amoe.service")
public class DubboServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(DubboServiceApplication.class, args);
    }
}
