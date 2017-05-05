package br.com.ciacpla.rovdigital.bean;

import br.com.ciacpla.rovdigital.dao.AirportDAO;
import br.com.ciacpla.rovdigital.entity.Airport;
import br.com.ciacpla.rovdigital.util.ErroSistema;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class AirportBean implements Serializable {

    private Airport airport = new Airport();
    private List<Airport> airports = new ArrayList<>();
    private AirportDAO airportDAO = new AirportDAO();

    public void adicionar() {
        try {
            new AirportDAO().salvar(airport);
            adicionarMensagem("Salvo!", "Salvo com sucesso!", FacesMessage.SEVERITY_INFO);
        } catch (ErroSistema ex) {
            adicionarMensagem(ex.getMessage(), ex.getCause().getMessage(), FacesMessage.SEVERITY_ERROR);
        }
    }

    public void listar() {
        try {
            airports = airportDAO.buscar();
            if (airports == null || airports.size() == 0) {
                adicionarMensagem("Nenhum dado encontrado!", "Sua busca não retornou nenhum carro!", FacesMessage.SEVERITY_WARN);
            }
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

    public List<Airport> getAirports() {
        return airports;
    }

    public void setAirports(List<Airport> airports) {
        this.airports = airports;
    }

    public AirportDAO getAirportDAO() {
        return airportDAO;
    }

    public void setAirportDAO(AirportDAO airportDAO) {
        this.airportDAO = airportDAO;
    }

}
