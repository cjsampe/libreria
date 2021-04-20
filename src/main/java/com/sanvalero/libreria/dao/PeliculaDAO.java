package com.sanvalero.libreria.dao;

import com.sanvalero.libreria.domain.Pelicula;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author María Carmen Jiménez Sampériz - DAW
 */

    public class PeliculaDAO {
   
    private Conexion conexion;
    //graciss a esto podemos hablar directamente con la base de datos
    public PeliculaDAO (Conexion conexion){
        this.conexion = conexion;
    }
    
    
    public ArrayList<Pelicula> verPelicula()throws SQLException{
    String sql= "SELECT NOMBRE_PELICULA, DIRECTOR, GENERO FROM PELICULA";
    
    
    ArrayList<Pelicula> peliculas = new ArrayList<>();
        
        PreparedStatement sentencia = conexion.getConexion().prepareStatement(sql);
        ResultSet resultado = sentencia.executeQuery();
        while (resultado.next()) {
            Pelicula pelicula = new Pelicula();
            pelicula.setNombrePelicula(resultado.getString(1));
            pelicula.setDirector(resultado.getString(2));
            pelicula.setGenero(resultado.getString(3));
            
            
            
            peliculas.add(pelicula);
        }
        return peliculas;
    }
 }
    
