package com.damon.oa.mapper;

import com.damon.oa.model.Nation;
import java.util.List;

public interface NationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Nation record);

    Nation selectByPrimaryKey(Integer id);

    List<Nation> selectAll();

    int updateByPrimaryKey(Nation record);
}