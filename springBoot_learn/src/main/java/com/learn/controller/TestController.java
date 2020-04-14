package com.learn.controller;


import com.learn.domain.User;
import com.learn.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class TestController {

    @Autowired
    private UserMapper userMapper;

    /**
     * 测试mybatis和springMVC
     * @return
     */
    @RequestMapping("/test")
    @ResponseBody
    public String Test_springBoot_mybatis(){
        List<User> users = userMapper.queryUserList();
        for(User user : users){
            System.out.println(user);
        }
        return "<h1>success</h1>";
    }
}
