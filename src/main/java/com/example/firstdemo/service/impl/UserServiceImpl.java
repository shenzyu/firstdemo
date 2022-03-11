package com.example.firstdemo.service.impl;

import com.example.firstdemo.bean.User;
import com.example.firstdemo.dao.UserRepository;
import com.example.firstdemo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: wxj
 * @Date: 2022/3/4 18:23
 */
@Service("UserServiceImpl")
public class UserServiceImpl implements UserService {
    @Resource
    UserRepository userRepository;

    @Override
    public User getUserById(Integer id){
        return userRepository.findById(id).get();
    }


    @Override
    public User getUserByName(String username) {
        return userRepository.findByUsername(username);
    }
}
