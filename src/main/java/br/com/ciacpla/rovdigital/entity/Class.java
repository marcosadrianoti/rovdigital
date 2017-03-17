package br.com.ciacpla.rovdigital.entity;

import java.util.Date;

public class Class {
    private int id;
    private Instructor teacher;
    private Date date;
    private float time;
    private boolean theoreticalCourse;
    private boolean groundSchool;
    private String subject;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Instructor getTeacher() {
        return teacher;
    }

    public void setTeacher(Instructor teacher) {
        this.teacher = teacher;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getTime() {
        return time;
    }

    public void setTime(float time) {
        this.time = time;
    }

    public boolean isTheoreticalCourse() {
        return theoreticalCourse;
    }

    public void setTheoreticalCourse(boolean theoreticalCourse) {
        this.theoreticalCourse = theoreticalCourse;
    }

    public boolean isGroundSchool() {
        return groundSchool;
    }

    public void setGroundSchool(boolean groundSchool) {
        this.groundSchool = groundSchool;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    
}
