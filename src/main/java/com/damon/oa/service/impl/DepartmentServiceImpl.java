package com.damon.oa.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.damon.oa.util.PageUtils;
import com.damon.oa.util.Query;

import com.damon.oa.mapper.DepartmentMapper;
import com.damon.oa.model.Department;
import com.damon.oa.service.DepartmentService;


@Service("departmentService")
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements DepartmentService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<Department> page = this.page(
                new Query<Department>().getPage(params),
                new QueryWrapper<Department>()
        );

        return new PageUtils(page);
    }

}