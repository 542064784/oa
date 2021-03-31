package com.damon.oa.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.damon.oa.util.PageUtils;
import com.damon.oa.util.Query;

import com.damon.oa.mapper.EmployeetrainMapper;
import com.damon.oa.model.Employeetrain;
import com.damon.oa.service.EmployeetrainService;


@Service("employeetrainService")
public class EmployeetrainServiceImpl extends ServiceImpl<EmployeetrainMapper, Employeetrain> implements EmployeetrainService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<Employeetrain> page = this.page(
                new Query<Employeetrain>().getPage(params),
                new QueryWrapper<Employeetrain>()
        );

        return new PageUtils(page);
    }

}