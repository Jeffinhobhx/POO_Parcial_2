package CartolaFC.modeloDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import CartolaFC.config.Conexao;
import CartolaFC.modelodados.Cartoleta;

public abstract class CartoletaDAO {
    
    public static void adicionarCartoleta(Cartoleta cartoleta) throws SQLException{
        Connection con = Conexao.getConnection();
        System.out.println("Conectado!");
        String sql = "DELETE FROM cartoletas; INSERT INTO cartoletas VALUES (?);";       
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setFloat(1, cartoleta.getCartoleta());
        stmt.execute();
        stmt.close();
        con.close();
    }
    
}