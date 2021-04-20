package com.sanvalero.libreria.domain;
/**
 *
 * @author María Carmen Jiménez Sampériz - DAW
 */
public class Musica {
    
    private String nombreAlbum;
    private String nombreGrupo;
    private String discografica;
    private float duracionAlbum;
    private int anio;
    
    public Musica(){
        
    }

    public String getNombreAlbum() {
        return nombreAlbum;
    }

    public void setNombreAlbum(String nombreAlbum) {
        this.nombreAlbum = nombreAlbum;
    }

    public String getNombreGrupo() {
        return nombreGrupo;
    }

    public void setNombreGrupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }

    public String getDiscografica() {
        return discografica;
    }

    public void setDiscografica(String discografica) {
        this.discografica = discografica;
    }

    public float getDuracionAlbum() {
        return duracionAlbum;
    }

    public void setDuracionAlbum(float duracionAlbum) {
        this.duracionAlbum = duracionAlbum;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    
    
}
