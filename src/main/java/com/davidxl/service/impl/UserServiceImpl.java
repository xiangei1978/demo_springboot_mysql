package com.davidxl.service.impl;

import com.davidxl.dao.UserMapper;
import com.davidxl.model.User;
import com.davidxl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xianglei on 2018/4/17.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public int insertSelective(User user) {
        return userMapper.insertSelective(user);

    }


    @Override
    public User selectByPrimaryKey(Integer id) {

        return userMapper.selectByPrimaryKey(id);

    }
}
