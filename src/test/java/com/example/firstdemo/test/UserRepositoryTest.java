package com.example.firstdemo.test;

import com.example.firstdemo.bean.User;
import com.example.firstdemo.dao.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Optional;

/**
 * @Author: wxj
 * @Date: 2022/3/3 10:17
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
//@TestConfiguration
public  class UserRepositoryTest {

    @Autowired
    public UserRepository userRepository;

    @Test
    public void getUser() {
        Optional<User> optional =userRepository.findById(1);
        System.out.println("获取用户成功》》"+optional.get().getNickName());
    }
}