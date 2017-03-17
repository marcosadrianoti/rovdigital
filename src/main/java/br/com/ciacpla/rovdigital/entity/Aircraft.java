package br.com.ciacpla.rovdigital.entity;

import java.util.Date;

public class Aircraft {
    private int id;
    private String icaoRegistry;
    private CategoryAircraft category;
    private String manufacturer;
    private String aircraftCode;
    private int serialNumber;
    private Date yearManufacture;
    private Date iamDate;
    private float tsnAirframe;
    private float tsnPowerPlant;
    private float tsnPropeller;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIcaoRegistry() {
        return icaoRegistry;
    }

    public void setIcaoRegistry(String icaoRegistry) {
        this.icaoRegistry = icaoRegistry;
    }

    public CategoryAircraft getCategory() {
        return category;
    }

    public void setCategory(CategoryAircraft category) {
        this.category = category;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getAircraftCode() {
        return aircraftCode;
    }

    public void setAircraftCode(String aircraftCode) {
        this.aircraftCode = aircraftCode;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Date getYearManufacture() {
        return yearManufacture;
    }

    public void setYearManufacture(Date yearManufacture) {
        this.yearManufacture = yearManufacture;
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
    
}
