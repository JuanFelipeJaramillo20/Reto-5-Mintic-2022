/*
 * Juan Felipe Jaramillo Losada - 202060257
 * Introducción a la programación orientada a objetos - IPOO
 * Universidad del Valle
 */
package controlador;

import java.sql.SQLException;
import java.util.ArrayList;
import modelo.dao.Consulta1DAO;
import modelo.dao.Consulta2DAO;
import modelo.dao.Consulta3DAO;
import modelo.vo.Consulta1Vo;
import modelo.vo.Consulta2Vo;
import modelo.vo.Consulta3Vo;
import vista.VentanaConsultas;

/**
 *
 * @author juanf
 */
public class controlador {
    
    private Consulta1DAO requerimiento_1Dao;
    private Consulta2DAO requerimiento_2Dao;
    private Consulta3DAO requerimiento_3Dao;
    
    public controlador() {
        this.requerimiento_1Dao = new Consulta1DAO();
        this.requerimiento_2Dao = new Consulta2DAO();
        this.requerimiento_3Dao = new Consulta3DAO();
    }

    public ArrayList<Consulta1Vo> consultarRequerimiento1() throws SQLException {
        
        return requerimiento_1Dao.requerimiento1();
    }

    public ArrayList<Consulta2Vo> consultarRequerimiento2() throws SQLException {
        return requerimiento_2Dao.requerimiento2();
    }

    public ArrayList<Consulta3Vo> consultarRequerimiento3() throws SQLException {
        return requerimiento_3Dao.requerimiento3();
    }
    
    public void mostrarVentanaConsultas(){
        VentanaConsultas ventanaConsulta = new VentanaConsultas();
        ventanaConsulta.setVisible(true);
    }


}
