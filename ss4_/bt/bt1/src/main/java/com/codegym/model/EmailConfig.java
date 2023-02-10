package com.codegym.model;

public class EmailConfig {
    private String language;
    private String pageSize;
    private boolean EnableFlg;
    private String signature;

    public EmailConfig() {
    }

    public EmailConfig(String language, String pageSize, boolean enableFlg, String signature) {
        this.language = language;
        this.pageSize = pageSize;
        EnableFlg = enableFlg;
        this.signature = signature;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public boolean isEnableFlg() {
        return EnableFlg;
    }

    public void setEnableFlg(boolean enableFlg) {
        EnableFlg = enableFlg;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
