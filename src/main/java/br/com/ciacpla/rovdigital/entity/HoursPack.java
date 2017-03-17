package br.com.ciacpla.rovdigital.entity;

public class HoursPack {
    private int id;
    private Pilot pilot;
    private float amountHours;
    private CategoryAircraft categoryAircraft;
    private float currentBalance;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    public float getAmountHours() {
        return amountHours;
    }

    public void setAmountHours(float amountHours) {
        this.amountHours = amountHours;
    }

    public CategoryAircraft getCategoryAircraft() {
        return categoryAircraft;
    }

    public void setCategoryAircraft(CategoryAircraft categoryAircraft) {
        this.categoryAircraft = categoryAircraft;
    }

    public float getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(float currentBalance) {
        this.currentBalance = currentBalance;
    }
    
}
