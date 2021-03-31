package com.damon.oa.mapper;

import com.damon.oa.model.MenuRole;
import java.util.List;

public interface MenuRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MenuRole record);

    MenuRole selectByPrimaryKey(Integer id);

    List<MenuRole> selectAll();

    int updateByPrimaryKey(MenuRole record);
}