package com.damon.oa.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.damon.oa.util.PageUtils;
import com.damon.oa.util.Query;

import com.damon.oa.mapper.MenuMapper;
import com.damon.oa.model.Menu;
import com.damon.oa.service.MenuService;


@Service("menuService")
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements MenuService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<Menu> page = this.page(
                new Query<Menu>().getPage(params),
                new QueryWrapper<Menu>()
        );

        return new PageUtils(page);
    }

}