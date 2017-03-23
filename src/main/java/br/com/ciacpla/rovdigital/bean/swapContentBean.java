    /*
    Troca o nome da página xhtml que será mostrada
    na div de conteúdo central.
    */

package br.com.ciacpla.rovdigital.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;

@ManagedBean
@RequestScoped
public class swapContentBean implements Serializable {

    /*private static final long serialVersionUID = 1L;*/

    private String name="Welcome.xhtml";

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}    
