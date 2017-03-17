package br.com.ciacpla.rovdigital.entity;

import java.util.Date;

public class Logbook {
    private int id;
    private String numberLogbook;
    private Aircraft aircraft;
    private float startTotalTime;
    private Date startDate;
    private float finalTotalTime;
    private Date finalDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumberLogbook() {
        return numberLogbook;
    }

    public void setNumberLogbook(String numberLogbook) {
        this.numberLogbook = numberLogbook;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    public float getStartTotalTime() {
        return startTotalTime;
    }

    public void setStartTotalTime(float startTotalTime) {
        this.startTotalTime = startTotalTime;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public float getFinalTotalTime() {
        return finalTotalTime;
    }

    public void setFinalTotalTime(float finalTotalTime) {
        this.finalTotalTime = finalTotalTime;
    }

    public Date getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(Date finalDate) {
        this.finalDate = finalDate;
    }
    
}
