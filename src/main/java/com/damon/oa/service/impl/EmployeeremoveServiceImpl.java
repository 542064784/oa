package com.damon.oa.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.damon.oa.util.PageUtils;
import com.damon.oa.util.Query;

import com.damon.oa.mapper.EmployeeremoveMapper;
import com.damon.oa.model.Employeeremove;
import com.damon.oa.service.EmployeeremoveService;


@Service("employeeremoveService")
public class EmployeeremoveServiceImpl extends ServiceImpl<EmployeeremoveMapper, Employeeremove> implements EmployeeremoveService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<Employeeremove> page = this.page(
                new Query<Employeeremove>().getPage(params),
                new QueryWrapper<Employeeremove>()
        );

        return new PageUtils(page);
    }

}