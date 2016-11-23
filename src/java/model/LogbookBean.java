package model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Marcos_Adriano
 */

@SessionScoped
@ManagedBean
public class LogbookBean extends FlightBean{
    private AirportBean from;
    private AirportBean to;
    private float dayTime;
    private float nigthTime;
    private float vfrTime;
    private float ifrrTime;
    private float ifrcTime;

    public AirportBean getFrom() {
        return from;
    }

    public void setFrom(AirportBean from) {
        this.from = from;
    }

    public AirportBean getTo() {
        return to;
    }

    public void setTo(AirportBean to) {
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
    
}
