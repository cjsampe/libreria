
package com.sanvalero.libreria.dao;

import com.sanvalero.libreria.domain.Libro;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author María Carmen Jiménez Sampériz - DAW
 */
public class LibroDAO {
   
    private Conexion conexion;
    //graciss a esto podemos hablar directamente con la base de datos
    public LibroDAO (Conexion conexion){
        this.conexion = conexion;
    }
    
    public ArrayList<Libro> verLibro()throws SQLException{
    String sql= "SELECT NOMBRE_TITULO, ESCRITOR, GENERO FROM LIBRO";
    
    
    ArrayList<Libro> libros = new ArrayList<>();
        
        PreparedStatement sentencia = conexion.getConexion().prepareStatement(sql);
        ResultSet resultado = sentencia.executeQuery();
        while (resultado.next()) {
            Libro libro = new Libro();
            libro.setNombreTitulo(resultado.getString(1));
            libro.setEscritor(resultado.getString(2));
            libro.setGenero(resultado.getString(3));
            
            
            
            libros.add(libro);
        }
        return libros;
}
    
}

