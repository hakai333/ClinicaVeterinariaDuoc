package com.example.demo.dto;

public class MascotaDTO {
    private String nombre;
    private String tipo;
    private String rut;

    public MascotaDTO() {
        this.nombre = "";
        this.tipo = "";
        this.rut = "";
    }

    public MascotaDTO(String nombre, String tipo, String rut) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }



    
}
