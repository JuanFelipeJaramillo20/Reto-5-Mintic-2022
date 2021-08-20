/*
 * Juan Felipe Jaramillo Losada - 202060257
 * Introducción a la programación orientada a objetos - IPOO
 * Universidad del Valle
 */
package modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.vo.Consulta2Vo;
import util.JDBCUtilities;

/**
 *
 * @author juanf
 */
public class Consulta2DAO {
    
    public ArrayList<Consulta2Vo> requerimiento2() throws SQLException {
        
        ArrayList<Consulta2Vo> response = new ArrayList<Consulta2Vo>();
        String sql = "SELECT p2.ID_Proyecto, c.Proveedor from Proyecto p2 INNER JOIN Compra c ON p2.ID_Proyecto = c.ID_Proyecto WHERE p2.Ciudad = 'Quibdo' ORDER BY p2.ID_Proyecto;";
        try (
            Connection connection = JDBCUtilities.getConnection();
            Statement st = connection.createStatement();
            ResultSet resultSet = st.executeQuery(sql); ){
                while(resultSet.next()){
                    Consulta2Vo req2 = new Consulta2Vo();
                    req2.setIdProyecto(resultSet.getInt("ID_Proyecto"));
                    req2.setProveedor(resultSet.getString("Proveedor"));
                    response.add(req2);
                }
            }
        return response;
    }
}
