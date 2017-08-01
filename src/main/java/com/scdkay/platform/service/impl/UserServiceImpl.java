package com.scdkay.platform.service.impl;

import com.scdkay.platform.dao.UserMapper;
import com.scdkay.platform.entity.User;
import com.scdkay.platform.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by liurui on 2017/7/28.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;


    public User selectUserById(int id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
