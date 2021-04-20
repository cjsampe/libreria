package com.sanvalero.libreria;

import com.sanvalero.libreria.dao.Conexion;
import com.sanvalero.libreria.dao.LibroDAO;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author María Carmen Jiménez Sampériz - DAW
 */
public class Libreria {
    private boolean salir;
    private Scanner teclado;
    private Conexion conexion;
    private LibroDAO libroDAO;
    
    public Libreria(){
        salir = false;
        teclado = new Scanner (System.in);
        conexion = new Conexion();
        conexion.conectar();
        libroDAO = new LibroDAO(conexion);
    }
}