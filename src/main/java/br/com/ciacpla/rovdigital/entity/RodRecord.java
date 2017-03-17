package br.com.ciacpla.rovdigital.entity;

public class RodRecord extends FlightRecord{
    private int id;
    private float startTac;
    private float finalTac;
    private String mission;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getStartTac() {
        return startTac;
    }

    public void setStartTac(float startTac) {
        this.startTac = startTac;
    }

    public float getFinalTac() {
        return finalTac;
    }

    public void setFinalTac(float finalTac) {
        this.finalTac = finalTac;
    }

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }
    
}
