package com.example.report.service;

import com.example.report.dao.AnalyzeMapper;
import com.example.report.model.Analyze;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnalyzeImpl implements IAnalyze {

    final AnalyzeMapper analyzeMapper;

    @Autowired
    public AnalyzeImpl(AnalyzeMapper analyzeMapper) {
        this.analyzeMapper = analyzeMapper;
    }

    @Override
    public List<Analyze> selectAll() {
        return analyzeMapper.selectAll();
    }
}
