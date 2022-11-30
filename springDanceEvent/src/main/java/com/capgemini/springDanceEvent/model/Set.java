package com.capgemini.springDanceEvent.model;

public class Set {
    private long setId;
    private String nameSet;
    private String beginTime;
    private String endTime;
    private String day;
    private String stage;

    public Set() {}

    public Set(long setId, String nameSet, String beginTime, String endTime, String day, String stage) {
        this.setId = setId;
        this.nameSet = nameSet;
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.day = day;
        this.stage = stage;
    }

    public long getSetId() { return setId; }

    public void setSetID(long setId) { this.setId = setId; }

    public String getNameSet() {
        return this.nameSet;
    }

    public void setNameSet(String nameSet) {
        this.nameSet = nameSet;
    }

    public String getBeginTime() {
        return this.beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getDay() { return this.day; }

    public void setDay(String day) {
        this.day = day;
    }

    public String getStage() {
        return this.stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }
}
