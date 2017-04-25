package br.com.ciacpla.rovdigital.entity;

public class User {
    private int id;
    private String userName;
    private String userPassword;
    private boolean conected;
    private boolean accessReports;
    private boolean accessPilots;
    private boolean accessAircrafts;
    private boolean accessInstructors;
    private boolean accessAirports;
    private boolean accessFlights;
    private boolean accessClasses;
    private boolean accessUsers;
    private boolean accessMaintenances;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public boolean isConected() {
        return conected;
    }

    public void setConected(boolean conected) {
        this.conected = conected;
    }

    public boolean isAccessReports() {
        return accessReports;
    }

    public void setAccessReports(boolean accessReports) {
        this.accessReports = accessReports;
    }

    public boolean isAccessPilots() {
        return accessPilots;
    }

    public void setAccessPilots(boolean accessPilots) {
        this.accessPilots = accessPilots;
    }

    public boolean isAccessAircrafts() {
        return accessAircrafts;
    }

    public void setAccessAircrafts(boolean accessAircrafts) {
        this.accessAircrafts = accessAircrafts;
    }

    public boolean isAccessInstructors() {
        return accessInstructors;
    }

    public void setAccessInstructors(boolean accessInstructors) {
        this.accessInstructors = accessInstructors;
    }

    public boolean isAccessAirports() {
        return accessAirports;
    }

    public void setAccessAirports(boolean accessAirports) {
        this.accessAirports = accessAirports;
    }

    public boolean isAccessFlights() {
        return accessFlights;
    }

    public void setAccessFlights(boolean accessFlights) {
        this.accessFlights = accessFlights;
    }

    public boolean isAccessClasses() {
        return accessClasses;
    }

    public void setAccessClasses(boolean accessClasses) {
        this.accessClasses = accessClasses;
    }

    public boolean isAccessUsers() {
        return accessUsers;
    }

    public void setAccessUsers(boolean accessUsers) {
        this.accessUsers = accessUsers;
    }

    public boolean isAccessMaintenances() {
        return accessMaintenances;
    }

    public void setAccessMaintenances(boolean accessMaintenances) {
        this.accessMaintenances = accessMaintenances;
    }
    
}
