package com.sanvalero.libreria;

import com.sanvalero.libreria.dao.Conexion;
import com.sanvalero.libreria.dao.LibroDAO;
import com.sanvalero.libreria.dao.MusicaDAO;
import com.sanvalero.libreria.dao.PeliculaDAO;
import com.sanvalero.libreria.domain.Libro;
import com.sanvalero.libreria.domain.Musica;
import com.sanvalero.libreria.domain.Pelicula;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
    private PeliculaDAO peliculaDAO;
    private MusicaDAO musicaDAO;
    
    public Libreria(){
        salir = false;
        teclado = new Scanner (System.in);
        conexion = new Conexion();
        conexion.conectar();
        libroDAO = new LibroDAO(conexion);
       // peliculaDAO = new PeliculaDAO(conexion);
        //libroDAO = new LibroDAO(conexion);
    }
    
        public void ejecutar() throws SQLException{
        do{
            System.out.println("Aplicación Entornos v0.1");
            System.out.println("1. Ver libros disponibles");
            System.out.println("2. Añadir libros");
            System.out.println("3. Eliminar libros");
            System.out.println("4. Ver películas disponibles");
            System.out.println("5. Añadir películas ");
            System.out.println("6. Eliminar películas");
            System.out.println("7. Ver álbumes disponibles");
            System.out.println("8. Añadir álbumes");
            System.out.println("9. Eliminar álbumes");
            System.out.println("x. Salir");
            System.out.println("Selecciona la opción que desees");
            String opcion = teclado.nextLine();
            
            switch (opcion){
                //hecho
                case"1":
                    verLibro();
                    break;
                //hecho
                case"2":
                    anadirLibro();
                    break;
                case"3":
                    eliminarLibro();
                    break;
                case"4":
                    verPelicula();
                    break;
                case"5":
                    anadirPelicula();
                    break;
                case"6":
                    eliminarPelicula();
                    break;
                    //hecho
                case"7":
                    verAlbum();
                    break;
                case"8":
                    anadirAlbum();
                    break;
                case"9":
                    eliminarAlbum();
                case"x":
                    salir();
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        }while(!salir);
    }
    private void salir(){
        salir = true;
        System.out.println("Ha decido salir de la Aplicación. Hasta la próxima");  
    }
    
    private void verLibro(){
         try {
            ArrayList<Libro> libros = libroDAO.verLibro();
            for (Libro libro : libros) {
                System.out.println(libro);
            }
        } catch (SQLException sqle) {
            System.out.println("Se ha producido un problema leyendo los datos");
            sqle.printStackTrace();
        }
        
    }
    
    private void anadirLibro(){
        
    }
    
    
    private void eliminarLibro(){
        
    }
    
    private void verPelicula(){
        try {
            ArrayList<Pelicula> peliculas = peliculaDAO.verPelicula();
            for (Pelicula pelicula : peliculas) {
                System.out.println(pelicula);
            }
        } catch (SQLException sqle) {
            System.out.println("Se ha producido un problema leyendo los datos");
            sqle.printStackTrace();
        }
        
    }
    
    private void anadirPelicula(){
        
    }
    
    
    private void eliminarPelicula(){
        
    }
    
      private void verAlbum(){
           try {
            ArrayList<Musica> musicas = musicaDAO.verAlbum();
            for (Musica musica : musicas) {
                System.out.println(musica);
            }
        } catch (SQLException sqle) {
            System.out.println("Se ha producido un problema leyendo los datos");
            sqle.printStackTrace();
        }
        
    }
    
    private void anadirAlbum(){
        
    }
    
    
    private void eliminarAlbum(){
        
    }
    
    
    
}  