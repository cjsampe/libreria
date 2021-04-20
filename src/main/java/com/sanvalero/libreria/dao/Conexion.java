
package com.sanvalero.libreria.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author María Carmen Jiménez Sampériz - DAW
 */
public class Conexion {
    //VARIABLE CONEXION
    private Connection conexion;
    private final String DRIVER = "oracle.jdbc.driver.OracleDriver";
    private final String URL_CONEXION = "jdbc:oracle:thin:@localhost:1521/xe";
    private final String USUARIO = "LIBROS";
    private final String CONTRASENA = "LIBROS";
    //CONSTRUCTOR
    public Conexion(){
        
    }
    //GETTER PARA LA CONEXION
    public Connection getConexion(){
        return conexion;
    }
    //CLASE CONECTAR
    public void conectar() {
        try {
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL_CONEXION, USUARIO, CONTRASENA);
        } catch (ClassNotFoundException cnfe) {
            cnfe.printStackTrace();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }
    //CLASE DESCONECTAR
    public void desconectar() {
        try {
            conexion.close();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }
}

