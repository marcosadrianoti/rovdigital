package model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Marcos_Adriano
 */

@SessionScoped
@ManagedBean
public class RodBean extends FlightBean{

    private float startTac;
    private float finalTac;

    public float getStartTac() {
        return startTac;
    }

    public void setStartTac(float startTac) {
        this.startTac = startTac;
    }

    public float getFinalTac() {
        return finalTac;
    }

    public void setFinalTac(float finalTac) {
        this.finalTac = finalTac;
    }
   
}
