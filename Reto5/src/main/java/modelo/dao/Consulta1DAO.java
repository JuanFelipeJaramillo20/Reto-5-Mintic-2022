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
import modelo.vo.Consulta1Vo;
import util.JDBCUtilities;

/**
 *
 * @author juanf
 */
public class Consulta1DAO {
    
    public ArrayList<Consulta1Vo> requerimiento1() throws SQLException {
       
        ArrayList<Consulta1Vo> response = new ArrayList<Consulta1Vo>();
        String sql = "SELECT Ciudad_Residencia, AVG(Salario) AS Promedio FROM Lider group by Ciudad_Residencia HAVING  AVG(Salario) < 600000 ORDER BY Promedio DESC;";
        try (
            Connection connection = JDBCUtilities.getConnection();
            Statement st = connection.createStatement();
            ResultSet resultSet = st.executeQuery(sql);){
                while(resultSet.next()){
                    Consulta1Vo req1 = new Consulta1Vo();
                    req1.setCiudadResidencia(resultSet.getString("Ciudad_Residencia"));
                    req1.setSalarioPromedio(resultSet.getDouble("Promedio"));
                    response.add(req1);
                }
            }
        return response;
    }
}
