package com.diegog.a9listapersonalizada.Model;

import java.io.Serializable;

public class Entidad implements Serializable {

    // La imagen es un entero porque hara referencia a la id de la imagen
    private int imgFoto;
    private String titulo;
    private String contenido;

    public int getImgFoto() {
        return imgFoto;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getContenido() {
        return contenido;
    }



    public Entidad(int imgFoto, String titulo, String contenido) {
        this.imgFoto = imgFoto;
        this.titulo = titulo;
        this.contenido = contenido;
    }


}
