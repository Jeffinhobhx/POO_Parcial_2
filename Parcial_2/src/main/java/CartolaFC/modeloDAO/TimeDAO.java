package CartolaFC.modeloDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import CartolaFC.config.Conexao;
import CartolaFC.modelodados.Time;

public abstract class TimeDAO {
    
    public static List<Time> buscarTimes() throws SQLException{
        Connection con = Conexao.getConnection();
        System.out.println("Conectado!");
        String sql = "SELECT * FROM temp_cartolafc2018";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        List<Time> times = new ArrayList<Time>();
        while (rs.next()) {
                    Time time = new Time();
                    time.setJogador(rs.getString("jogador"));
                    time.setPosicao(rs.getString("posicao"));
                    time.setPreco(rs.getString("preco"));
                    time.setProbabilidade(rs.getString("probabilidade"));
                    times.add(time);
        }
        rs.close();
        stmt.close();
        con.close();
        return times;
    }
}