package com.capgemini.springDanceEvent.model;

import jakarta.persistence.*;

@Entity
public class Dj {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "dj_id")
    private long Id;

    @Column(name = "dj_name")
    private String name;

    @Column(name = "musicStyle")
    private String musicStyle;

    @Column(name = "age")
    private int age;

    public Dj() {}

    public Dj(String name, String musicStyle, int age) {
        this.name = name;
        this.musicStyle = musicStyle;
        this.age = age;
    }

    public long getId() { return this.Id; }

    public void setId() { this.Id = Id; }

    public String getName() { return this.name; }

    public void setName(String name) { this.name = name; }

    public String getMusicStyle() { return this.musicStyle; }

    public void setMusicStyle(String musicStyle) {
        this.musicStyle = musicStyle;
    }

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }
}
