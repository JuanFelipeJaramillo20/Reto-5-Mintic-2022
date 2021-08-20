/*
 * Juan Felipe Jaramillo Losada - 202060257
 * Introducción a la programación orientada a objetos - IPOO
 * Universidad del Valle
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author juanf
 */
public class JDBCUtilities {
    private static final String DATABASE_LOCATION = "ProyectosConstruccion.db";

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:sqlite:" + DATABASE_LOCATION;

        return DriverManager.getConnection(url);
    }
}
