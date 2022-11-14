package com.example.report.dao;

import com.example.report.model.ConditionKind;

public interface ConditionKindMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ConditionKind row);

    int insertSelective(ConditionKind row);

    ConditionKind selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ConditionKind row);

    int updateByPrimaryKey(ConditionKind row);
}