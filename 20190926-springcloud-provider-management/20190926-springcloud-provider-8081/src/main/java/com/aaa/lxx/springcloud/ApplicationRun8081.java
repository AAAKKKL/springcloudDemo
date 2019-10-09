package com.aaa.lxx.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: LXX
 * @date ：Created in 2019/9/26 22:05
 * @description：
 * @modified By：
 * @version: $
 */
@SpringBootApplication
@MapperScan("com.aaa.lxx.springcloud.mapper")
@EnableDiscoveryClient
public class ApplicationRun8081 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun8081.class, args);
    }
}
