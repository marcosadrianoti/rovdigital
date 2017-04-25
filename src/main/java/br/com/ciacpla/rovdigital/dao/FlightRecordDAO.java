package br.com.ciacpla.rovdigital.dao;

import br.com.ciacpla.rovdigital.entity.LogbookRecord;
import br.com.ciacpla.rovdigital.entity.RodRecord;
import br.com.ciacpla.rovdigital.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FlightRecordDAO {
    public void salvar(LogbookRecord lbr, RodRecord rr){
        try {
            Connection conexao = ConnectionFactory.getConexao();
            int lastIdRod = 0;
//            Dados do ROD
            String sqlRod;
            sqlRod = "INSERT INTO 'rod_records' ('date','final_time','start_time','total_time','start_tac','final_tac','total_tac','landings','mission','id_pilot_1','id_pilot_2','obs','id_user_cross_checked') "
                   + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement psRod = conexao.prepareStatement(sqlRod, Statement.RETURN_GENERATED_KEYS);
            psRod.setDate(1, new Date(rr.getDate().getTime()));
            psRod.setTime(2, new Time(rr.getFinalTime().getTime()));
            psRod.setTime(3, new Time(rr.getStartTime().getTime()));
            psRod.setFloat(4, rr.getTotalTime());
            psRod.setFloat(5, rr.getStartTac());
            psRod.setFloat(6, rr.getFinalTac());
            psRod.setFloat(7, rr.getTotalTac());
            psRod.setInt(8, rr.getLandings());
            psRod.setString(9, rr.getMission());
            psRod.setInt(10, rr.getPilot1().getId());
            psRod.setInt(11, rr.getPilot2().getId());
            psRod.setString(12, rr.getObs());
            psRod.setInt(13, rr.getCrossChecked().getId());
            psRod.execute();
            ResultSet rs = psRod.getGeneratedKeys();
            if (rs.next()) {
                lastIdRod = rs.getInt(1);
            }
//            Dados do Logbook
            String sqlLog;
            sqlLog = "INSERT INTO 'log_records' ('id_logbook','id_rod','page_logbook','id_airport_to','id_airport_from','date',"
                    +"'start_time','final_time','total_time','total_tac','day_time','night_time','vfr_time','ifrr_time','ifrc_time',"
                    +"'landings','nat','id_pilot_1','id_pilot_2','solo','obs','id_user_cross_checked') "
                    +"VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement psLog = conexao.prepareStatement(sqlLog);
            psLog.setInt(1, lbr.getLogbook().getId());
            psLog.setInt(2, lastIdRod);
            psLog.setInt(3, lbr.getPageLogbook());
            psLog.setInt(4, lbr.getTo().getId());
            psLog.setInt(5, lbr.getFrom().getId());
            psLog.setDate(6, new Date(lbr.getDate().getTime()));
            psLog.setTime(7, new Time(lbr.getStartTime().getTime()));
            psLog.setTime(8, new Time(lbr.getFinalTime().getTime()));
            psLog.setFloat(9, lbr.getTotalTime());
            psLog.setFloat(10, lbr.getTotalTac());
            psLog.setFloat(11, lbr.getDayTime());
            psLog.setFloat(12, lbr.getNigthTime());
            psLog.setFloat(13, lbr.getVfrTime());
            psLog.setFloat(14, lbr.getIfrrTime());
            psLog.setFloat(15, lbr.getIfrcTime());
            psLog.setInt(16, lbr.getLandings());
            psLog.setString(17, lbr.getNat());
            psLog.setInt(18, lbr.getPilot1().getId());
            psLog.setInt(19, lbr.getPilot2().getId());
            psLog.setBoolean(20, lbr.isSolo());
            psLog.setString(21, lbr.getObs());
            psLog.setInt(22, lbr.getCrossChecked().getId());
            psLog.execute();
            
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(FlightRecordDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
