package com.learn.mapper;

import com.learn.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    /**
     * 查询所有用户并返回User集合
     * @return
     */
    public List<User> queryUserList();
}
