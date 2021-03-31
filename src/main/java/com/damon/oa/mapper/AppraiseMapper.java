package com.damon.oa.mapper;

import com.damon.oa.model.Appraise;
import java.util.List;

public interface AppraiseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Appraise record);

    Appraise selectByPrimaryKey(Integer id);

    List<Appraise> selectAll();

    int updateByPrimaryKey(Appraise record);
}