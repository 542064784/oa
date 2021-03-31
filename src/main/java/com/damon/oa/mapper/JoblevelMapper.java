package com.damon.oa.mapper;

import com.damon.oa.model.Joblevel;
import java.util.List;

public interface JoblevelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Joblevel record);

    Joblevel selectByPrimaryKey(Integer id);

    List<Joblevel> selectAll();

    int updateByPrimaryKey(Joblevel record);
}