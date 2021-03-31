package com.damon.oa.mapper;

import com.damon.oa.model.Msgcontent;
import java.util.List;

public interface MsgcontentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Msgcontent record);

    Msgcontent selectByPrimaryKey(Integer id);

    List<Msgcontent> selectAll();

    int updateByPrimaryKey(Msgcontent record);
}