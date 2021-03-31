package com.damon.oa.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.damon.oa.util.PageUtils;
import com.damon.oa.util.Query;

import com.damon.oa.mapper.PositionMapper;
import com.damon.oa.model.Position;
import com.damon.oa.service.PositionService;


@Service("positionService")
public class PositionServiceImpl extends ServiceImpl<PositionMapper, Position> implements PositionService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<Position> page = this.page(
                new Query<Position>().getPage(params),
                new QueryWrapper<Position>()
        );

        return new PageUtils(page);
    }

}