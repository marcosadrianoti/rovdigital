package model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Marcos_Adriano
 */

@SessionScoped
@ManagedBean
public class HoursPackBean {
    private PilotBean student;
    private float amountHours;
    private String categoryAircraft;

    public PilotBean getStudent() {
        return student;
    }

    public void setStudent(PilotBean student) {
        this.student = student;
    }

    public float getAmountHours() {
        return amountHours;
    }

    public void setAmountHours(float amountHours) {
        this.amountHours = amountHours;
    }

    public String getCategoryAircraft() {
        return categoryAircraft;
    }

    public void setCategoryAircraft(String categoryAircraft) {
        this.categoryAircraft = categoryAircraft;
    }
    
    
}
