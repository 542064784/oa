package com.damon.oa.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.damon.oa.util.PageUtils;
import com.damon.oa.util.Query;

import com.damon.oa.mapper.JoblevelMapper;
import com.damon.oa.model.Joblevel;
import com.damon.oa.service.JoblevelService;


@Service("joblevelService")
public class JoblevelServiceImpl extends ServiceImpl<JoblevelMapper, Joblevel> implements JoblevelService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<Joblevel> page = this.page(
                new Query<Joblevel>().getPage(params),
                new QueryWrapper<Joblevel>()
        );

        return new PageUtils(page);
    }

}