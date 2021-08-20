/*
 * Juan Felipe Jaramillo Losada - 202060257
 * Introducción a la programación orientada a objetos - IPOO
 * Universidad del Valle
 */
package vista;

import controlador.controlador;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.vo.Consulta1Vo;

/**
 *
 * @author juanf
 */
public class PanelConsulta1 extends JPanel {
    
    private String[] nombresColumnas = {"Ciudad de Residencia", "Salario Promedio"};
    private JScrollPane scrollPane;
    private JTable tabla;
    private controlador control;
    
    public PanelConsulta1(){
        control = new controlador();
       
        setSize(400, 400);
        setLayout(null);
        tabla = new JTable(inicializarTabla());
        
        scrollPane = new JScrollPane(tabla);
        scrollPane.setSize(400, 400);
        tabla.setFillsViewportHeight(true);
        tabla.setSize(400, 400);
        add(scrollPane);
        setVisible(true);
        
    }

    private DefaultTableModel inicializarTabla(){
        ArrayList<Consulta1Vo> lista = null;
        Object[][] ayudante = null;
        DefaultTableModel modelo = new DefaultTableModel(nombresColumnas, 0);
        try {
            lista = control.consultarRequerimiento1();
            ayudante = new Object[lista.size()][2];
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 0; i < lista.size(); i++) {
            ayudante[i][0] = lista.get(i).getCiudadResidencia();
            ayudante[i][1] = Math.round(lista.get(i).getSalarioPromedio());
        }
        modelo = new DefaultTableModel(ayudante, nombresColumnas);
        return  modelo;
    }
}
