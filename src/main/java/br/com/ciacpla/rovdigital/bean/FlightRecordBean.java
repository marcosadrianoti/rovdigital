package br.com.ciacpla.rovdigital.bean;

import br.com.ciacpla.rovdigital.dao.FlightRecordDAO;
import br.com.ciacpla.rovdigital.entity.LogbookRecord;
import br.com.ciacpla.rovdigital.entity.RodRecord;
import br.com.ciacpla.rovdigital.util.ErroSistema;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class FlightRecordBean {
    private LogbookRecord lbRecord = new LogbookRecord();
    private RodRecord rdRecord = new RodRecord();
    
    public void adicionar() throws ErroSistema{
        new FlightRecordDAO().salvar(lbRecord, rdRecord);
    }

    public LogbookRecord getLbRecord() {
        return lbRecord;
    }

    public void setLbRecord(LogbookRecord lbRecord) {
        this.lbRecord = lbRecord;
    }

    public RodRecord getRdRecord() {
        return rdRecord;
    }

    public void setRdRecord(RodRecord rdRecord) {
        this.rdRecord = rdRecord;
    }
    
}
