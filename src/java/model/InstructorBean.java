package model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Marcos_Adriano
 */

@SessionScoped
@ManagedBean
public class InstructorBean extends PilotBean{
    private boolean fliesAtSchool;
    private String bank;
    private String agency;
    private String account;
    private String cpf;

    public boolean getFliesAtSchool() {
        return fliesAtSchool;
    }

    public void setFliesAtSchool(boolean fliesAtSchool) {
        this.fliesAtSchool = fliesAtSchool;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
}
