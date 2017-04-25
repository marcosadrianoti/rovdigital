package br.com.ciacpla.rovdigital.entity;

public class LogbookRecord extends FlightRecord{
    private int id;
    private Logbook logbook;
    private int pageLogbook;
    private RodRecord rodRecord;
    private Airport from;
    private Airport to;
    private float dayTime;
    private float nigthTime;
    private float vfrTime;
    private float ifrrTime;
    private float ifrcTime;
    private boolean solo;
    private String nat;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Logbook getLogbook() {
        return logbook;
    }

    public void setLogbook(Logbook logbook) {
        this.logbook = logbook;
    }

    public int getPageLogbook() {
        return pageLogbook;
    }

    public void setPageLogbook(int pageLogbook) {
        this.pageLogbook = pageLogbook;
    }

    public RodRecord getRodRecord() {
        return rodRecord;
    }

    public void setRodRecord(RodRecord rodRecord) {
        this.rodRecord = rodRecord;
    }

    public Airport getFrom() {
        return from;
    }

    public void setFrom(Airport from) {
        this.from = from;
    }

    public Airport getTo() {
        return to;
    }

    public void setTo(Airport to) {
        this.to = to;
    }

    public float getDayTime() {
        return dayTime;
    }

    public void setDayTime(float dayTime) {
        this.dayTime = dayTime;
    }

    public float getNigthTime() {
        return nigthTime;
    }

    public void setNigthTime(float nigthTime) {
        this.nigthTime = nigthTime;
    }

    public float getVfrTime() {
        return vfrTime;
    }

    public void setVfrTime(float vfrTime) {
        this.vfrTime = vfrTime;
    }

    public float getIfrrTime() {
        return ifrrTime;
    }

    public void setIfrrTime(float ifrrTime) {
        this.ifrrTime = ifrrTime;
    }

    public float getIfrcTime() {
        return ifrcTime;
    }

    public void setIfrcTime(float ifrcTime) {
        this.ifrcTime = ifrcTime;
    }

    public boolean isSolo() {
        return solo;
    }

    public void setSolo(boolean solo) {
        this.solo = solo;
    }

    public String getNat() {
        return nat;
    }

    public void setNat(String nat) {
        this.nat = nat;
    }
    
}
