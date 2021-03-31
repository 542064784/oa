package com.damon.oa.mapper;

import com.damon.oa.model.Empsalary;
import java.util.List;

public interface EmpsalaryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Empsalary record);

    Empsalary selectByPrimaryKey(Integer id);

    List<Empsalary> selectAll();

    int updateByPrimaryKey(Empsalary record);
}