package com.example.model;

public class Settiing {
    private String lang, signature;
    private Integer pageSize;
    private Boolean isSpam;

    public Settiing (String lang , String signature , Integer pageSize , Boolean isSpam) {
        this.lang = lang;
        this.signature = signature;
        this.pageSize = pageSize;
        this.isSpam = isSpam;
    }

    public Settiing () {
    }

    public String getLang () {
        return lang;
    }

    public void setLang (String lang) {
        this.lang = lang;
    }

    public String getSignature () {
        return signature;
    }

    public void setSignature (String signature) {
        this.signature = signature;
    }

    public Integer getPageSize () {
        return pageSize;
    }

    public void setPageSize (Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Boolean getIsSpam () {
        return isSpam;
    }

    public void setIsSpam (Boolean spam) {
        isSpam = spam;
    }
}
