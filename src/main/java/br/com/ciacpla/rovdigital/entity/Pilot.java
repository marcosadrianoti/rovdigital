package br.com.ciacpla.rovdigital.entity;

import java.util.Date;

public class Pilot {
    private int id;
    private String name;
    private String canac;
    private String email;
    private String foneWhatsapp;
    private int cmaClass;
    private Date cmaValidity;
    private int ppaLicense;
    private int pcaLicense;
    private int plaLicense;
    private Date mnteValidity;
    private Date mlteValidity;
    private Date ifraValidity;
    private Date invaValidity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCanac() {
        return canac;
    }

    public void setCanac(String canac) {
        this.canac = canac;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFoneWhatsapp() {
        return foneWhatsapp;
    }

    public void setFoneWhatsapp(String foneWhatsapp) {
        this.foneWhatsapp = foneWhatsapp;
    }

    public int getCmaClass() {
        return cmaClass;
    }

    public void setCmaClass(int cmaClass) {
        this.cmaClass = cmaClass;
    }

    public Date getCmaValidity() {
        return cmaValidity;
    }

    public void setCmaValidity(Date cmaValidity) {
        this.cmaValidity = cmaValidity;
    }

    public int getPpaLicense() {
        return ppaLicense;
    }

    public void setPpaLicense(int ppaLicense) {
        this.ppaLicense = ppaLicense;
    }

    public int getPcaLicense() {
        return pcaLicense;
    }

    public void setPcaLicense(int pcaLicense) {
        this.pcaLicense = pcaLicense;
    }

    public int getPlaLicense() {
        return plaLicense;
    }

    public void setPlaLicense(int plaLicense) {
        this.plaLicense = plaLicense;
    }

    public Date getMnteValidity() {
        return mnteValidity;
    }

    public void setMnteValidity(Date mnteValidity) {
        this.mnteValidity = mnteValidity;
    }

    public Date getMlteValidity() {
        return mlteValidity;
    }

    public void setMlteValidity(Date mlteValidity) {
        this.mlteValidity = mlteValidity;
    }

    public Date getIfraValidity() {
        return ifraValidity;
    }

    public void setIfraValidity(Date ifraValidity) {
        this.ifraValidity = ifraValidity;
    }

    public Date getInvaValidity() {
        return invaValidity;
    }

    public void setInvaValidity(Date invaValidity) {
        this.invaValidity = invaValidity;
    }
    
}
