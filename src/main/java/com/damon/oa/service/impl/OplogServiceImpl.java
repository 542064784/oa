package com.damon.oa.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.damon.oa.util.PageUtils;
import com.damon.oa.util.Query;

import com.damon.oa.mapper.OplogMapper;
import com.damon.oa.model.Oplog;
import com.damon.oa.service.OplogService;


@Service("oplogService")
public class OplogServiceImpl extends ServiceImpl<OplogMapper, Oplog> implements OplogService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<Oplog> page = this.page(
                new Query<Oplog>().getPage(params),
                new QueryWrapper<Oplog>()
        );

        return new PageUtils(page);
    }

}