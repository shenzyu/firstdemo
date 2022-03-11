package com.example.firstdemo.controller;

import com.example.firstdemo.bean.User;
import com.example.firstdemo.dao.UserRepository;
import com.example.firstdemo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;

/**
 * @Author: wxj
 * @Date: 2022/2/18 11:56
 */
@Controller
@Api(tags = "用户信息管理")
@RequestMapping("test")
public class TestController {

    @Resource
    UserService userService;
//
//    @RequestMapping(value = "/wangbadan",method = RequestMethod.GET)
//    @ResponseBody
//    public User wangbadan(){
//        return userService.getUserById(1);
//    }
//
//    @RequestMapping(value = "/zylwbd",method = RequestMethod.GET)
//    @ResponseBody
//    public String zylwbd(){
//        return "zylwbd ";
//    }



    @GetMapping(value = "{id}")
    @ApiOperation("根据ID查询用户")
    @ResponseBody
    public User getUserById( @PathVariable Integer id){
        return userService.getUserById(id);
    }

    @PostMapping("query")
    @ApiOperation("根据姓名查询用户")
    @ResponseBody
    public User getUserByName(User user){
        return userService.getUserByName(user.getUserName());
    }
}
