package com.damon.oa.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.damon.oa.util.PageUtils;
import com.damon.oa.util.Query;

import com.damon.oa.mapper.MenuRoleMapper;
import com.damon.oa.model.MenuRole;
import com.damon.oa.service.MenuRoleService;


@Service("menuRoleService")
public class MenuRoleServiceImpl extends ServiceImpl<MenuRoleMapper, MenuRole> implements MenuRoleService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<MenuRole> page = this.page(
                new Query<MenuRole>().getPage(params),
                new QueryWrapper<MenuRole>()
        );

        return new PageUtils(page);
    }

}