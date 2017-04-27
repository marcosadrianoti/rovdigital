package br.com.ciacpla.rovdigital.bean;

import br.com.ciacpla.rovdigital.dao.AirportDAO;
import br.com.ciacpla.rovdigital.entity.Airport;
import br.com.ciacpla.rovdigital.util.ErroSistema;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class AirportBean {
    private Airport airport = new Airport();
    
    public void adicionar(){
        try {
            new AirportDAO().salvar(airport);
            adicionarMensagem("Salvo!", "Salvo com sucesso!", FacesMessage.SEVERITY_INFO);
        } catch (ErroSistema ex) {
            adicionarMensagem(ex.getMessage(), ex.getCause().getMessage(), FacesMessage.SEVERITY_ERROR);
        }
    }

    public void adicionarMensagem(String sumario, String detalhe, FacesMessage.Severity tipoErro) {
        FacesContext context = FacesContext.getCurrentInstance();
        FacesMessage message = new FacesMessage(tipoErro, sumario, detalhe);
        context.addMessage(null, message);
    }
    
    public Airport getAirport() {
        return airport;
    }

    public void setAirport(Airport airport) {
        this.airport = airport;
    }
    
}
