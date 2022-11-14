package com.example.report.model;

public class Analyze {
    private Integer id;

    private Integer kindid;

    private String title;

    private String type;

    private String charttype;

    private String chartunit;

    private String chartseries;

    private String chartcolumn;

    private String path;

    private String commandtype;

    private String command;

    private String header;

    private String memo;

    private String chartsort;

    private Integer chartminlimit;

    private Integer chartmaxlimit;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getKindid() {
        return kindid;
    }

    public void setKindid(Integer kindid) {
        this.kindid = kindid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getCharttype() {
        return charttype;
    }

    public void setCharttype(String charttype) {
        this.charttype = charttype == null ? null : charttype.trim();
    }

    public String getChartunit() {
        return chartunit;
    }

    public void setChartunit(String chartunit) {
        this.chartunit = chartunit == null ? null : chartunit.trim();
    }

    public String getChartseries() {
        return chartseries;
    }

    public void setChartseries(String chartseries) {
        this.chartseries = chartseries == null ? null : chartseries.trim();
    }

    public String getChartcolumn() {
        return chartcolumn;
    }

    public void setChartcolumn(String chartcolumn) {
        this.chartcolumn = chartcolumn == null ? null : chartcolumn.trim();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public String getCommandtype() {
        return commandtype;
    }

    public void setCommandtype(String commandtype) {
        this.commandtype = commandtype == null ? null : commandtype.trim();
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command == null ? null : command.trim();
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header == null ? null : header.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getChartsort() {
        return chartsort;
    }

    public void setChartsort(String chartsort) {
        this.chartsort = chartsort == null ? null : chartsort.trim();
    }

    public Integer getChartminlimit() {
        return chartminlimit;
    }

    public void setChartminlimit(Integer chartminlimit) {
        this.chartminlimit = chartminlimit;
    }

    public Integer getChartmaxlimit() {
        return chartmaxlimit;
    }

    public void setChartmaxlimit(Integer chartmaxlimit) {
        this.chartmaxlimit = chartmaxlimit;
    }
}