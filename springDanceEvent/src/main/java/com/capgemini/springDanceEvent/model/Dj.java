package com.capgemini.springDanceEvent.model;

public class Dj {
    private long ID;
    private String name;
    private String musicStyle;
    private int age;

    public Dj() {}

    public Dj(long ID, String name, String musicStyle, int age) {
        this.ID = ID;
        this.name = name;
        this.musicStyle = musicStyle;
        this.age = age;
    }

    public long getID() { return this.ID; }

    public void setID() { this.ID = ID; }

    public String getName() { return this.name; }

    public void setName(String name) { this.name = name; }

    public String getMusicStyle() { return this.musicStyle; }

    public void setMusicStyle(String musicStyle) {
        this.musicStyle = musicStyle;
    }

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }
}
