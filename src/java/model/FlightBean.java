package model;

import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Marcos_Adriano
 */

@SessionScoped
@ManagedBean
public class FlightBean {
    private AircraftBean aircraft;
    private Date date;
    private Date startTime;
    private Date finalTime;
    private float totalTime;
    private float totalTac;
    private Integer landings;
    private String nat;
    private PilotBean pilot1;
    private PilotBean pilot2;
    private String obs;
    private UserBean crossChecked;

    public AircraftBean getAircraft() {
        return aircraft;
    }

    public void setAircraft(AircraftBean aircraft) {
        this.aircraft = aircraft;
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

    public Integer getLandings() {
        return landings;
    }

    public void setLandings(Integer landings) {
        this.landings = landings;
    }

    public String getNat() {
        return nat;
    }

    public void setNat(String nat) {
        this.nat = nat;
    }

    public PilotBean getPilot1() {
        return pilot1;
    }

    public void setPilot1(PilotBean pilot1) {
        this.pilot1 = pilot1;
    }

    public PilotBean getPilot2() {
        return pilot2;
    }

    public void setPilot2(PilotBean pilot2) {
        this.pilot2 = pilot2;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public UserBean getCrossChecked() {
        return crossChecked;
    }

    public void setCrossChecked(UserBean crossChecked) {
        this.crossChecked = crossChecked;
    }
    
        
}
