package com.aaa.lxx.springcloud.controller;

import com.aaa.lxx.springcloud.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author: LXX
 * @date ：Created in 2019/9/29 14:33
 * @description：
 * @modified By：
 * @version: $
 */
@RestController
public class UserController {
    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping("/userAll")
    public List<User> selectAllUser(){
        return restTemplate.getForObject("http://localhost:8081/userAll",List.class);
    }
}
