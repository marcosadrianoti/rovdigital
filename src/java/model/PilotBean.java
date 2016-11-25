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
public class PilotBean {
    private String name;
    private String canac;
    private int cmaClass;
    private Date cmaValidity;
    private String email;

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
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
