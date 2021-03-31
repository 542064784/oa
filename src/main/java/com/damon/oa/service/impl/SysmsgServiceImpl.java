package com.damon.oa.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.damon.oa.util.PageUtils;
import com.damon.oa.util.Query;

import com.damon.oa.mapper.SysmsgMapper;
import com.damon.oa.model.Sysmsg;
import com.damon.oa.service.SysmsgService;


@Service("sysmsgService")
public class SysmsgServiceImpl extends ServiceImpl<SysmsgMapper, Sysmsg> implements SysmsgService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<Sysmsg> page = this.page(
                new Query<Sysmsg>().getPage(params),
                new QueryWrapper<Sysmsg>()
        );

        return new PageUtils(page);
    }

}