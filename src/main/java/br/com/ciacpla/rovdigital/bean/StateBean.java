
package br.com.ciacpla.rovdigital.bean;

import br.com.ciacpla.rovdigital.entity.State;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class StateBean {
    private State estado = new State();
    private List<State> estados = new ArrayList<>();
    
    public void Adicionar(){
        estados.add(estado);
        estado = new State();
    }

    public State getEstado() {
        return estado;
    }

    public void setEstado(State estado) {
        this.estado = estado;
    }

    public List<State> getEstados() {
        return estados;
    }

    public void setEstados(List<State> estados) {
        this.estados = estados;
    }
    
}
