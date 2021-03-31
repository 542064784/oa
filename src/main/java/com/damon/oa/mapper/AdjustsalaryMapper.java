package com.damon.oa.mapper;

import com.damon.oa.model.Adjustsalary;
import java.util.List;

public interface AdjustsalaryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Adjustsalary record);

    Adjustsalary selectByPrimaryKey(Integer id);

    List<Adjustsalary> selectAll();

    int updateByPrimaryKey(Adjustsalary record);
}