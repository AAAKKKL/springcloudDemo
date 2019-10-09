package com.aaa.lxx.springcloud;

import com.aaa.lxx.ribbon.rule.RibbonRuleMine;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author: LXX
 * @date ：Created in 2019/9/29 16:16
 * @description：
 * @modified By：
 * @version: $
 */
@SpringBootApplication
@EnableDiscoveryClient
@RibbonClient(name = "USER-PROVIDER", configuration = RibbonRuleMine.class)
public class ApplicationRun6082 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun6082.class, args);
    }
}
