package com.damon.oa.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.damon.oa.util.PageUtils;
import com.damon.oa.util.Query;

import com.damon.oa.mapper.EmpsalaryMapper;
import com.damon.oa.model.Empsalary;
import com.damon.oa.service.EmpsalaryService;


@Service("empsalaryService")
public class EmpsalaryServiceImpl extends ServiceImpl<EmpsalaryMapper, Empsalary> implements EmpsalaryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<Empsalary> page = this.page(
                new Query<Empsalary>().getPage(params),
                new QueryWrapper<Empsalary>()
        );

        return new PageUtils(page);
    }

}