package com.capgemini.springDanceEvent.model;

import jakarta.persistence.*;

@Entity
public class Set {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "set_id")
    private long id;

    @Column(name = "name_set")
    private String nameSet;

    @Column(name = "begin_time")
    private String beginTime;

    @Column(name = "end_time")
    private String endTime;

    @Column(name = "day")
    private String day;

    @Column(name = "stage")
    private String stage;

    public Set() {}

    public Set(String nameSet, String beginTime, String endTime, String day, String stage) {
        this.nameSet = nameSet;
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.day = day;
        this.stage = stage;
    }

    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

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
