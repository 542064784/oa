package com.damon.oa.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.damon.oa.util.PageUtils;
import com.damon.oa.util.Query;

import com.damon.oa.mapper.AppraiseMapper;
import com.damon.oa.model.Appraise;
import com.damon.oa.service.AppraiseService;


@Service("appraiseService")
public class AppraiseServiceImpl extends ServiceImpl<AppraiseMapper, Appraise> implements AppraiseService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<Appraise> page = this.page(
                new Query<Appraise>().getPage(params),
                new QueryWrapper<Appraise>()
        );

        return new PageUtils(page);
    }

}