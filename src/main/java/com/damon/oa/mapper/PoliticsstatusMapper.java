package com.damon.oa.mapper;

import com.damon.oa.model.Politicsstatus;
import java.util.List;

public interface PoliticsstatusMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Politicsstatus record);

    Politicsstatus selectByPrimaryKey(Integer id);

    List<Politicsstatus> selectAll();

    int updateByPrimaryKey(Politicsstatus record);
}