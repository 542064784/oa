package com.damon.oa.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.damon.oa.util.PageUtils;
import com.damon.oa.util.Query;

import com.damon.oa.mapper.SalaryMapper;
import com.damon.oa.model.Salary;
import com.damon.oa.service.SalaryService;


@Service("salaryService")
public class SalaryServiceImpl extends ServiceImpl<SalaryMapper, Salary> implements SalaryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<Salary> page = this.page(
                new Query<Salary>().getPage(params),
                new QueryWrapper<Salary>()
        );

        return new PageUtils(page);
    }

}