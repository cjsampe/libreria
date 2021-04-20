package com.sanvalero.libreria.dao;

import com.sanvalero.libreria.domain.Musica;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author María Carmen Jiménez Sampériz - DAW
 */

    public class MusicaDAO {
   
    private Conexion conexion;
    //graciss a esto podemos hablar directamente con la base de datos
    public MusicaDAO (Conexion conexion){
        this.conexion = conexion;
    }
    
    public ArrayList<Musica> verAlbum()throws SQLException{
    String sql= "SELECT NOMBRE_ALBUM, NOMBRE_GRUPO, DISCOGRAFIA FROM MUSICA";
    
    
    ArrayList<Musica> musicas = new ArrayList<>();
        
        PreparedStatement sentencia = conexion.getConexion().prepareStatement(sql);
        ResultSet resultado = sentencia.executeQuery();
        while (resultado.next()) {
            Musica musica = new Musica();
            musica.setNombreAlbum(resultado.getString(1));
            musica.setNombreGrupo(resultado.getString(2));
            musica.setDiscografica(resultado.getString(3));
            
            
            
            musicas.add(musica);
        }
        return musicas;
    }
 }
    
