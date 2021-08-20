/*
 * Juan Felipe Jaramillo Losada - 202060257
 * Introducción a la programación orientada a objetos - IPOO
 * Universidad del Valle
 */
package modelo.vo;

/**
 *
 * @author juanf
 */
public class Consulta1Vo {
    
    private String ciudadResidencia;
    private double salarioPromedio;

    public String getCiudadResidencia() {
        return ciudadResidencia;
    }

    public void setCiudadResidencia(String ciudadResidencia) {
        this.ciudadResidencia = ciudadResidencia;
    }

    public double getSalarioPromedio() {
        return salarioPromedio;
    }

    public void setSalarioPromedio(double salarioPromedio) {
        this.salarioPromedio = salarioPromedio;
    }
}
