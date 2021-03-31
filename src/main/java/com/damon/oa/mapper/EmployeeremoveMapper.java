package com.damon.oa.mapper;

import com.damon.oa.model.Employeeremove;
import java.util.List;

public interface EmployeeremoveMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Employeeremove record);

    Employeeremove selectByPrimaryKey(Integer id);

    List<Employeeremove> selectAll();

    int updateByPrimaryKey(Employeeremove record);
}