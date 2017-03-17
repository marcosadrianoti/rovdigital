package br.com.ciacpla.rovdigital.entity;

public class Instructor extends Pilot{
    private int id;
    private boolean invaFliesAtSchool;
    private String bank;
    private String agency;
    private String account;
    private String cpf;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isInvaFliesAtSchool() {
        return invaFliesAtSchool;
    }

    public void setInvaFliesAtSchool(boolean invaFliesAtSchool) {
        this.invaFliesAtSchool = invaFliesAtSchool;
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
