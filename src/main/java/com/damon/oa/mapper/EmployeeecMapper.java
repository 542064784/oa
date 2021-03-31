package com.damon.oa.mapper;

import com.damon.oa.model.Employeeec;
import java.util.List;

public interface EmployeeecMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Employeeec record);

    Employeeec selectByPrimaryKey(Integer id);

    List<Employeeec> selectAll();

    int updateByPrimaryKey(Employeeec record);
}