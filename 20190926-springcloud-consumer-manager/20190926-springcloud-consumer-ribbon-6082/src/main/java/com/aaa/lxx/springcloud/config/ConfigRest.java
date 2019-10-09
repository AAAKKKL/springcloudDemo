package com.aaa.lxx.springcloud.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author: LXX
 * @date ：Created in 2019/9/29 16:20
 * @description：
 * @modified By：
 * @version: $
 */
@SpringBootApplication
public class ConfigRest {
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
