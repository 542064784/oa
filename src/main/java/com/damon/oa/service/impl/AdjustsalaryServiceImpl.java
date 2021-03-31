package com.damon.oa.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.damon.oa.util.PageUtils;
import com.damon.oa.util.Query;

import com.damon.oa.mapper.AdjustsalaryMapper;
import com.damon.oa.model.Adjustsalary;
import com.damon.oa.service.AdjustsalaryService;


@Service("adjustsalaryService")
public class AdjustsalaryServiceImpl extends ServiceImpl<AdjustsalaryMapper, Adjustsalary> implements AdjustsalaryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<Adjustsalary> page = this.page(
                new Query<Adjustsalary>().getPage(params),
                new QueryWrapper<Adjustsalary>()
        );

        return new PageUtils(page);
    }

}