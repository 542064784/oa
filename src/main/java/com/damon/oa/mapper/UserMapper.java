package com.damon.oa.mapper;

import com.damon.oa.model.Role;
import com.damon.oa.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 *  user mapper
 *
 * @author Damon Chen
 * @date 2021/03/10
 */
@Mapper
public interface UserMapper {

    /**
     *  根据username 获得user对象
     *
     * @param username   username
     * @return           user
     */
    User loadUserByUsername(final String username);

    List<Role> getUserRolesById(final Integer id);



}
