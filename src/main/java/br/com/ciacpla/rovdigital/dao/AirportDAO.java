package br.com.ciacpla.rovdigital.dao;

import br.com.ciacpla.rovdigital.entity.Airport;
import br.com.ciacpla.rovdigital.util.ConnectionFabrica;
import br.com.ciacpla.rovdigital.util.ErroSistema;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AirportDAO {
    public void salvar(Airport airp) throws ErroSistema{
        try {
            Connection conexao = ConnectionFabrica.getConexao();
            String sqlAirp;
            sqlAirp = "INSERT INTO 'airports' ('icao_code','city','id_state') VALUES (?,?,?)";
            PreparedStatement psAirp = conexao.prepareStatement(sqlAirp);
            psAirp.setString(1, airp.getIcaoCode());
            psAirp.setString(2, airp.getCity());
            psAirp.setInt(3, airp.getState().getId());
            psAirp.execute();
            conexao.close();
        } catch (SQLException ex) {
            throw new ErroSistema("Erro ao tentar salvar", ex);
        }
    }
}
