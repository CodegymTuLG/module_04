package com.example.case_study.model;

public class Division {
    private int workpart_id;
    private String workpart;

    public Division() {
    }

    public Division(int workpart_id, String workpart) {
        this.workpart_id = workpart_id;
        this.workpart = workpart;
    }

    public Division(int workpart_id) {
        this.workpart_id = workpart_id;
    }

    public int getWorkpart_id() {
        return workpart_id;
    }

    public void setWorkpart_id(int workpart_id) {
        this.workpart_id = workpart_id;
    }

    public String getWorkpart() {
        return workpart;
    }

    public void setWorkpart(String workpart) {
        this.workpart = workpart;
    }
}
