/*
 * Juan Felipe Jaramillo Losada - 202060257
 * Introducción a la programación orientada a objetos - IPOO
 * Universidad del Valle
 */
package vista;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author juanf
 */
public class VentanaConsultas extends JFrame implements ActionListener{

    private JTable tablaConsulta1;
    private JTabbedPane pestanas;
    private PanelConsulta1 panel1;
    private PanelConsulta2 panel2;
    private PanelConsulta3 panel3;
    
    public VentanaConsultas(){
        setSize(400,400);
        setTitle("Consultas Base de Datos");
        setLocationRelativeTo(null);
        setResizable(true);
        setLayout(new GridLayout(1, 1));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        panel1 = new PanelConsulta1();
        panel2 = new PanelConsulta2();
        panel3 = new PanelConsulta3();
        
        pestanas = new JTabbedPane(JTabbedPane.TOP);
        pestanas.addTab("Consulta 1", panel1);
        pestanas.addTab("Consulta 2", panel2);
        pestanas.addTab("Consulta 3", panel3);
        add(pestanas);
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
