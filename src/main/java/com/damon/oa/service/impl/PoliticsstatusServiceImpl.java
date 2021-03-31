package com.damon.oa.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.damon.oa.util.PageUtils;
import com.damon.oa.util.Query;

import com.damon.oa.mapper.PoliticsstatusMapper;
import com.damon.oa.model.Politicsstatus;
import com.damon.oa.service.PoliticsstatusService;


@Service("politicsstatusService")
public class PoliticsstatusServiceImpl extends ServiceImpl<PoliticsstatusMapper, Politicsstatus> implements PoliticsstatusService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<Politicsstatus> page = this.page(
                new Query<Politicsstatus>().getPage(params),
                new QueryWrapper<Politicsstatus>()
        );

        return new PageUtils(page);
    }

}