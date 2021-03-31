package com.damon.oa.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.damon.oa.util.PageUtils;
import com.damon.oa.util.Query;

import com.damon.oa.mapper.NationMapper;
import com.damon.oa.model.Nation;
import com.damon.oa.service.NationService;


@Service("nationService")
public class NationServiceImpl extends ServiceImpl<NationMapper, Nation> implements NationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<Nation> page = this.page(
                new Query<Nation>().getPage(params),
                new QueryWrapper<Nation>()
        );

        return new PageUtils(page);
    }

}