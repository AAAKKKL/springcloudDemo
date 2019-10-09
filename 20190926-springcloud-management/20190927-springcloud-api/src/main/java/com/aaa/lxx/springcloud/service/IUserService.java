package com.aaa.lxx.springcloud.service;

import com.aaa.lxx.springcloud.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author: LXX
 * @date ：Created in 2019/9/29 22:07
 * @description：
 * @modified By：
 * @version: $
 */
@FeignClient(value = "USER-PROVIDER")
public interface IUserService {

    @RequestMapping("/userAll")
    List<User> selectAllUsers();

}
