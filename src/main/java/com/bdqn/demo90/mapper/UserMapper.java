package com.bdqn.demo90.mapper;

import com.bdqn.demo90.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import javax.jws.soap.SOAPBinding;

/**
 * @outhor shkstart
 * 浮瑞龙
 */

public interface UserMapper {
    //id是否整張          那給列為自動整張列
    //@Options(useGeneratedKeys = true,keyProperty ="id" )
//    @Select("SELECT * from smbms_user  where id=#{id}")
//    public User getid(Integer id);
}
