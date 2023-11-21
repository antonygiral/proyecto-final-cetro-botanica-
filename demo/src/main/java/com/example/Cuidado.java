package com.example;

import java.util.List; 

public class Cuidado {
    private String NombreC;
    private String Planta;
    private List<Cuidado> Cuidados; 

    public Cuidado(String NombreC, String Planta, List<Cuidado> Cuidados) {
        this.NombreC = NombreC;
        this.Planta = Planta;
        this.Cuidados = Cuidados;
    }

  
    public String getNombreC() {
        return NombreC;
    }

    public void setNombreC(String NombreC) {
        this.NombreC = NombreC;
    }

    // Getters y setters para Planta
    public String getPlanta() {
        return Planta;
    }

    public void setPlanta(String Planta) {
        this.Planta = Planta;
    }

    
    public List<Cuidado> getCuidados() {
        return Cuidados;
    }

    
    public void setCuidados(List<Cuidado> Cuidados) {
        this.Cuidados = Cuidados;
    }

    
    @Override
    public String toString() {
        return super.toString() + "Nombre" + NombreC + ", Tipo" + Planta;
    }

    
    public void agregarCuidado(Cuidado cuidado) {
        Cuidados.add(cuidado);
    }
}
