package com.sanvalero.libreria.domain;
/**
 *
 * @author María Carmen Jiménez Sampériz - DAW
 */
public class Libro {
    
    private String nombreTitulo;
    private String escritor;
    private String genero;
    private float paginas;
    private int anio;
    
    public Libro(){
        
    }

    public String getNombreTitulo() {
        return nombreTitulo;
    }

    public void setNombreTitulo(String nombreTitulo) {
        this.nombreTitulo = nombreTitulo;
    }

    public String getEscritor() {
        return escritor;
    }

    public void setEscritor(String escritor) {
        this.escritor = escritor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public float getPaginas() {
        return paginas;
    }

    public void setPaginas(float paginas) {
        this.paginas = paginas;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    
    
     @Override
    public String toString() {
        return "Libro{" + "nombreTitulo=" + nombreTitulo + ", escritor=" + escritor + ", genero=" + genero +  '}';
    }
    
    
}
