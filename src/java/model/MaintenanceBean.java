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
public class MaintenanceBean {
    private Date dateMaintenance;
    private String performedMaintenance;
    private String nextMaintenance;
    private float availableTime;
    private String obs;

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
