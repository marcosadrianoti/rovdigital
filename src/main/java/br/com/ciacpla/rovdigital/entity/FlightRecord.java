package br.com.ciacpla.rovdigital.entity;

import java.util.Date;

public class FlightRecord {
    private int id;
    private Date date;
    private Date startTime;
    private Date finalTime;
    private float totalTime;
    private float totalTac;
    private int landings;
    private Pilot pilot1;
    private Pilot pilot2;
    private String obs;
    private User crossChecked;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getFinalTime() {
        return finalTime;
    }

    public void setFinalTime(Date finalTime) {
        this.finalTime = finalTime;
    }

    public float getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(float totalTime) {
        this.totalTime = totalTime;
    }

    public float getTotalTac() {
        return totalTac;
    }

    public void setTotalTac(float totalTac) {
        this.totalTac = totalTac;
    }

    public int getLandings() {
        return landings;
    }

    public void setLandings(int landings) {
        this.landings = landings;
    }

    public Pilot getPilot1() {
        return pilot1;
    }

    public void setPilot1(Pilot pilot1) {
        this.pilot1 = pilot1;
    }

    public Pilot getPilot2() {
        return pilot2;
    }

    public void setPilot2(Pilot pilot2) {
        this.pilot2 = pilot2;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public User getCrossChecked() {
        return crossChecked;
    }

    public void setCrossChecked(User crossChecked) {
        this.crossChecked = crossChecked;
    }
        
}
