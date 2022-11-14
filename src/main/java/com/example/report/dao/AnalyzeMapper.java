package com.example.report.dao;

import com.example.report.model.Analyze;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface AnalyzeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Analyze row);

    int insertSelective(Analyze row);

    Analyze selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Analyze row);

    int updateByPrimaryKey(Analyze row);

    List<Analyze> selectAll();
}