package com.aaa.lxx.springcloud.controller;

import com.aaa.lxx.springcloud.model.User;
import com.aaa.lxx.springcloud.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: LXX
 * @date ：Created in 2019/9/29 14:49
 * @description：
 * @modified By：
 * @version: $
 */
@RestController
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping("/userAll")
    public List<User> selectAllUser() {
        System.out.println(8081);

        return userService.selectAllUsers();
    }
}
