package CartolaFC.modeloDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import CartolaFC.config.Conexao;
import CartolaFC.modelodados.Jogador;

public abstract class JogadorDAO {
    
    public static List<Jogador> buscarJogadores() throws SQLException{
        Connection con = Conexao.getConnection();
        System.out.println("Conectado!");
        String sql = "SELECT * FROM cartolafc2018";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        List<Jogador> jogadores = new ArrayList<Jogador>();
        while (rs.next()) {
                    Jogador jogador = new Jogador();
                    jogador.setJogador(rs.getString("jogador"));
                    jogador.setPosicao(rs.getString("posicao"));
                    jogador.setPreco(rs.getString("preco"));
                    jogador.setProbabilidade(rs.getString("probabilidade"));
                    jogadores.add(jogador);
        }
        rs.close();
        stmt.close();
        con.close();
        return jogadores;
    }
}