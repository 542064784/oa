package com.damon.oa.mapper;

import com.damon.oa.model.Employeetrain;
import java.util.List;

public interface EmployeetrainMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Employeetrain record);

    Employeetrain selectByPrimaryKey(Integer id);

    List<Employeetrain> selectAll();

    int updateByPrimaryKey(Employeetrain record);
}