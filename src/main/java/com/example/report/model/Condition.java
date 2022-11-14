package com.example.report.model;

public class Condition {
    private Integer id;

    private Integer kindid;

    private String caption;

    private String code;

    private String type;

    private String command;

    private String initvalue;

    private String isvaild;

    private String ishidden;

    private Short oid;

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

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption == null ? null : caption.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command == null ? null : command.trim();
    }

    public String getInitvalue() {
        return initvalue;
    }

    public void setInitvalue(String initvalue) {
        this.initvalue = initvalue == null ? null : initvalue.trim();
    }

    public String getIsvaild() {
        return isvaild;
    }

    public void setIsvaild(String isvaild) {
        this.isvaild = isvaild == null ? null : isvaild.trim();
    }

    public String getIshidden() {
        return ishidden;
    }

    public void setIshidden(String ishidden) {
        this.ishidden = ishidden == null ? null : ishidden.trim();
    }

    public Short getOid() {
        return oid;
    }

    public void setOid(Short oid) {
        this.oid = oid;
    }
}