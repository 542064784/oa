package com.damon.oa.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.damon.oa.util.PageUtils;
import com.damon.oa.util.Query;

import com.damon.oa.mapper.EmployeeecMapper;
import com.damon.oa.model.Employeeec;
import com.damon.oa.service.EmployeeecService;


@Service("employeeecService")
public class EmployeeecServiceImpl extends ServiceImpl<EmployeeecMapper, Employeeec> implements EmployeeecService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<Employeeec> page = this.page(
                new Query<Employeeec>().getPage(params),
                new QueryWrapper<Employeeec>()
        );

        return new PageUtils(page);
    }

}