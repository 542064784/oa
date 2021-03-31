package com.damon.oa.mapper;

import com.damon.oa.model.Sysmsg;
import java.util.List;

public interface SysmsgMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Sysmsg record);

    Sysmsg selectByPrimaryKey(Integer id);

    List<Sysmsg> selectAll();

    int updateByPrimaryKey(Sysmsg record);
}