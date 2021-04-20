
package com.sanvalero.libreria.dao;

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
    
}

