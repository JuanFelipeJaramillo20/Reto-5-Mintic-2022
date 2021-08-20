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
import modelo.vo.Consulta3Vo;
import util.JDBCUtilities;

/**
 *
 * @author juanf
 */
public class Consulta3DAO {
 
    public ArrayList<Consulta3Vo> requerimiento3() throws SQLException {
        
        ArrayList<Consulta3Vo> response = new ArrayList<Consulta3Vo>();
        String sql = "SELECT p.ID_Proyecto , mc.Nombre_Material from Compra c INNER JOIN MaterialConstruccion mc ON mc.ID_MaterialConstruccion = c.ID_MaterialConstruccion INNER JOIN Proyecto p on p.ID_Proyecto  = c.ID_Proyecto WHERE p.ID_Proyecto BETWEEN 5 AND 15 ORDER BY p.ID_Proyecto;";
        try (
            Connection connection = JDBCUtilities.getConnection();
            Statement st = connection.createStatement();
            ResultSet resultSet = st.executeQuery(sql); ){
                while(resultSet.next()){
                    Consulta3Vo req3 = new Consulta3Vo();
                    req3.setIdProyecto(resultSet.getInt("ID_Proyecto"));
                    req3.setNombreMaterial(resultSet.getString("Nombre_Material"));
                    response.add(req3);
                }
            }
        return response;
}
}