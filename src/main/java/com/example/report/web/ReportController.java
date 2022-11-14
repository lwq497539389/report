package com.example.report.web;

import com.example.report.model.Analyze;
import com.example.report.service.IAnalyze;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ReportController {
    final IAnalyze analyzeImpl;

    @Autowired
    public ReportController(IAnalyze analyzeImpl) {
        this.analyzeImpl = analyzeImpl;
    }

    @PostMapping("/selectAll")
    public Result selectAll(@RequestParam int pageNumber,@RequestParam int pageSize) {
        PageHelper.startPage(pageNumber,pageSize);
        List<Analyze> list = analyzeImpl.selectAll();
        PageInfo<Analyze> pageInfo = new PageInfo<>(list);
        Map<String,Object> map = new HashMap<>();
        map.put("totalRows",pageInfo.getTotal());
        map.put("list",pageInfo.getList());
        return ResultUtil.success(map);
    }
}
