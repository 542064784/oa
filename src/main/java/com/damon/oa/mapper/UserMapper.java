package com.damon.oa.mapper;

import com.damon.oa.model.User;
import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(String user);

    int insert(User record);

    User selectByPrimaryKey(String user);

    List<User> selectAll();

    int updateByPrimaryKey(User record);
}