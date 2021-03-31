package com.damon.oa.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.damon.oa.util.PageUtils;
import com.damon.oa.model.Menu;

import java.util.Map;

/**
 * 
 *
 * @author Damon Chen
 * @email 542064784@qq.com
 * @date 2021-03-31 11:37:00
 */
public interface MenuService extends IService<Menu> {

    PageUtils queryPage(Map<String, Object> params);
}

