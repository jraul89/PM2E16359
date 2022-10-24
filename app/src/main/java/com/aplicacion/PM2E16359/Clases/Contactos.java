package com.aplicacion.PM2E16359.Clases;

public class Contactos {
    private int codigo;
    private String codigoPais;
    private String nombreContacto;
    private int numeroContacto;
    private String nota;

    public Contactos() {
    }

    public Contactos(int codigo, String codigoPais, String nombreContacto, int numeroContacto, String nota) {
        this.codigo = codigo;
        this.codigoPais = codigoPais;
        this.nombreContacto = nombreContacto;
        this.numeroContacto = numeroContacto;
        this.nota = nota;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCodigoPais() {
        return codigoPais;
    }

    public void setCodigoPais(String codigoPais) {
        this.codigoPais = codigoPais;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public int getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(int numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

}
