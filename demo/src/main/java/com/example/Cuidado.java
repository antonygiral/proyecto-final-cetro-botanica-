package com.example;

import java.util.List; 

public class Cuidado {
    private String NombreP;
    private String TipoP;
    private List<Cuidado> Cuidados; 

    public Cuidado(String NombreP, String TipoP, List<Cuidado> Cuidados) {
        this.NombreP = NombreP;
        this.TipoP = TipoP;
        this.Cuidados = Cuidados;
    }

  
    public String getNombreP() {
        return NombreP;
    }

    public void setNombreP(String NombreP) {
        this.NombreP = NombreP;
    }

    // Getters y setters para TipoP
    public String getTipoP() {
        return TipoP;
    }

    public void setTipoP(String TipoP) {
        this.TipoP = TipoP;
    }

    
    public List<Cuidado> getCuidados() {
        return Cuidados;
    }

    
    public void setCuidados(List<Cuidado> Cuidados) {
        this.Cuidados = Cuidados;
    }

    
    @Override
    public String toString() {
        return super.toString() + "Nombre" + NombreP + ", Tipo" + TipoP;
    }

    
    public void agregarCuidado(Cuidado cuidado) {
        Cuidados.add(cuidado);
    }
}
