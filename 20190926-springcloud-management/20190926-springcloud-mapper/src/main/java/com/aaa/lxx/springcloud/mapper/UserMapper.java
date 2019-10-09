package com.aaa.lxx.springcloud.mapper;

import com.aaa.lxx.springcloud.model.User;

import java.util.List;

/**
 * @author: LXX
 * @date ：Created in 2019/9/26 19:49
 * @description：
 * @modified By：
 * @version: $
 */
public interface UserMapper {
    List<User> selectAllUsers();
}
