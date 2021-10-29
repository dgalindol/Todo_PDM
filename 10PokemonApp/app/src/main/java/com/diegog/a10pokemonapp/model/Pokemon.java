package com.diegog.a10pokemonapp.model;

public class Pokemon {

    private String id;
    private String nombre;
    private Type tipo;

    public enum Type{
        FIRE, WATER, PLANT, ELECTRIC
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Type getTipo() {
        return tipo;
    }

    public void setTipo(Type tipo) {
        this.tipo = tipo;
    }

    public Pokemon(String id, String nombre, Type tipo) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getId(){
        return id;
    }
}
