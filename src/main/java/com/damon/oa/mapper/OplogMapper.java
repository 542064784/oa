package com.damon.oa.mapper;

import com.damon.oa.model.Oplog;
import java.util.List;

public interface OplogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Oplog record);

    Oplog selectByPrimaryKey(Integer id);

    List<Oplog> selectAll();

    int updateByPrimaryKey(Oplog record);
}