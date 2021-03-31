package com.damon.oa.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.damon.oa.util.PageUtils;
import com.damon.oa.model.Salary;

import java.util.Map;

/**
 * 
 *
 * @author Damon Chen
 * @email 542064784@qq.com
 * @date 2021-03-31 11:37:00
 */
public interface SalaryService extends IService<Salary> {

    PageUtils queryPage(Map<String, Object> params);
}

