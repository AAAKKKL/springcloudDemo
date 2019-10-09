package com.aaa.lxx.springcloud.service;

import com.aaa.lxx.springcloud.model.User;

import java.util.List;

/**
 * @author: LXX
 * @date ：Created in 2019/9/26 19:50
 * @description：
 * @modified By：
 * @version: $
 */
public interface IUserService {
    List<User> selectAllUsers();
}
