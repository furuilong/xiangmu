package com.bdqn.demo90.controller;

import com.bdqn.demo90.bean.User;
import com.bdqn.demo90.mapper.usersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @outhor shkstart
 * 浮瑞龙
 */
@RestController
public class Controller {
//    @Autowired
//    UserMapper userMapper;

    @Autowired
    private usersMapper usersMapper;


    @ResponseBody
    @GetMapping("/dept/{id}")
    public List<User> getUserId(@PathVariable Integer id) {

        return usersMapper.userList(id);
    }

}
