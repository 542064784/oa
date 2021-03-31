package com.damon.oa.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.damon.oa.util.PageUtils;
import com.damon.oa.util.Query;

import com.damon.oa.mapper.MsgcontentMapper;
import com.damon.oa.model.Msgcontent;
import com.damon.oa.service.MsgcontentService;


@Service("msgcontentService")
public class MsgcontentServiceImpl extends ServiceImpl<MsgcontentMapper, Msgcontent> implements MsgcontentService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<Msgcontent> page = this.page(
                new Query<Msgcontent>().getPage(params),
                new QueryWrapper<Msgcontent>()
        );

        return new PageUtils(page);
    }

}