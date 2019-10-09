package com.aaa.lxx.springcloud.service.impl;

import com.aaa.lxx.springcloud.mapper.UserMapper;
import com.aaa.lxx.springcloud.model.User;
import com.aaa.lxx.springcloud.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: LXX
 * @date ：Created in 2019/9/26 19:53
 * @description：
 * @modified By：
 * @version: $
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;
    public List<User> selectAllUsers() {
        return userMapper.selectAllUsers();
    }
}
