package com.aaa.lxx.springcloud.controller;

import com.aaa.lxx.springcloud.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author: LXX
 * @date ：Created in 2019/9/29 16:21
 * @description：
 * @modified By：
 * @version: $
 */
@RestController
public class UserController {
    private static final String URL = "http://USER-PROVIDER";
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @RequestMapping("/userAll")
    public List<User> selectAllUsers() {
        return restTemplate.getForObject(URL + "/userAll", List.class);
    }

    @RequestMapping("/userAllNoEureka")
    public List<User> selectAllUserNoEureka() {
        // 1.通过loadBalancerClient对象获取到所有的服务提供者的信息
        // 在application.properties配置文件中有一个配置user-provider.ribbon.listOfServers(value值)
        // 通过在8081,8082,8083中配置的spring.application.name的值进行获取
        // serviceId-->spring.application.name的值
        // serviceId-->也就是源码中的Object key
        // serviceInstance:Server对象
        ServiceInstance instance = loadBalancerClient.choose("user-provider");
//获取IP
        String host = instance.getHost();
        //获取端口号
        int port = instance.getPort();
        System.out.println(port);
// ip+port+requestMapping的路径
        return restTemplate.getForObject("http://" + host + ":" + port + "/userAll", List.class);
    }


}

