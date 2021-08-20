/*
 * Juan Felipe Jaramillo Losada - 202060257
 * Introducción a la programación orientada a objetos - IPOO
 * Universidad del Valle
 */
package vista;

import controlador.controlador;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.vo.Consulta2Vo;
import modelo.vo.Consulta3Vo;

/**
 *
 * @author juanf
 */
public class PanelConsulta3 extends JPanel {
    
    private String[] nombresColumnas = {"ID del Proyecto", "Nombre del Material"};
    private JScrollPane scrollPane;
    private JTable tabla;
    private controlador control;
    
    public PanelConsulta3(){
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
        ArrayList<Consulta3Vo> lista = null;
        Object[][] ayudante = null;
        DefaultTableModel modelo = new DefaultTableModel(nombresColumnas, 0);
        try {
            lista = control.consultarRequerimiento3();
            ayudante = new Object[lista.size()][2];
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 0; i < lista.size(); i++) {
            ayudante[i][0] = lista.get(i).getIdProyecto();
            ayudante[i][1] = lista.get(i).getNombreMaterial();
        }
        modelo = new DefaultTableModel(ayudante, nombresColumnas);
        return  modelo;
    }
}
