package com.example.report.dao;

import com.example.report.model.Condition;

public interface ConditionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Condition row);

    int insertSelective(Condition row);

    Condition selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Condition row);

    int updateByPrimaryKey(Condition row);
}