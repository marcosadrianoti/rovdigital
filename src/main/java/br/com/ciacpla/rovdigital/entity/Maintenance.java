package br.com.ciacpla.rovdigital.entity;

import java.util.Date;

public class Maintenance {
    private int id;
    private String serviceOrder;
    private Aircraft aircraft;
    private Date dateMaintenance;
    private String performedMaintenance;
    private String nextMaintenance;
    private float availableTime;
    private String obs;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getServiceOrder() {
        return serviceOrder;
    }

    public void setServiceOrder(String serviceOrder) {
        this.serviceOrder = serviceOrder;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    public Date getDateMaintenance() {
        return dateMaintenance;
    }

    public void setDateMaintenance(Date dateMaintenance) {
        this.dateMaintenance = dateMaintenance;
    }

    public String getPerformedMaintenance() {
        return performedMaintenance;
    }

    public void setPerformedMaintenance(String performedMaintenance) {
        this.performedMaintenance = performedMaintenance;
    }

    public String getNextMaintenance() {
        return nextMaintenance;
    }

    public void setNextMaintenance(String nextMaintenance) {
        this.nextMaintenance = nextMaintenance;
    }

    public float getAvailableTime() {
        return availableTime;
    }

    public void setAvailableTime(float availableTime) {
        this.availableTime = availableTime;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
    
}
