package com.aaa.lxx.springcloud.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author: LXX
 * @date ：Created in 2019/9/29 14:36
 * @description：
 * @modified By：
 * @version: $
 */
@SpringBootApplication
public class ConfigRset {
    @Bean
    public RestTemplate getRsetTemplate(){
        return new RestTemplate();
    }
}
