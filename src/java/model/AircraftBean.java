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
public class AircraftBean {
    private String icaoRegistry;
    private String aircraftCode;
    private Integer serialNumber;
    private Date iamDate;
    private float tsnAirframe;
    private float tsnPowerPlant;
    private float tsnPropeller;
    private MaintenanceBean maintenance;

    public String getIcaoRegistry() {
        return icaoRegistry;
    }

    public void setIcaoRegistry(String icaoRegistry) {
        this.icaoRegistry = icaoRegistry;
    }

    public String getAircraftCode() {
        return aircraftCode;
    }

    public void setAircraftCode(String aircraftCode) {
        this.aircraftCode = aircraftCode;
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Date getIamDate() {
        return iamDate;
    }

    public void setIamDate(Date iamDate) {
        this.iamDate = iamDate;
    }

    public float getTsnAirframe() {
        return tsnAirframe;
    }

    public void setTsnAirframe(float tsnAirframe) {
        this.tsnAirframe = tsnAirframe;
    }

    public float getTsnPowerPlant() {
        return tsnPowerPlant;
    }

    public void setTsnPowerPlant(float tsnPowerPlant) {
        this.tsnPowerPlant = tsnPowerPlant;
    }

    public float getTsnPropeller() {
        return tsnPropeller;
    }

    public void setTsnPropeller(float tsnPropeller) {
        this.tsnPropeller = tsnPropeller;
    }

    public MaintenanceBean getMaintenance() {
        return maintenance;
    }

    public void setMaintenance(MaintenanceBean maintenance) {
        this.maintenance = maintenance;
    }
    
    
}
