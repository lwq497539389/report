package com.example.report.web;

public class ResultUtil {
    public static Result success(Object data){
        return new Result(0,"操作成功！",data);
    }
}
