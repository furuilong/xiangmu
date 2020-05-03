package com.bdqn.demo90.mapper;

import com.bdqn.demo90.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @outhor shkstart
 * 浮瑞龙
 */
@Mapper
public interface usersMapper {

    public List<User> userList(Integer id);
}
