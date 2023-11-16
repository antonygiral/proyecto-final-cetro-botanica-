package com.example;
import class Planta;
public class com.example.CentroBotanicoMain {

    public static void main(String[] args) {
        
        Planta planta1 = new Planta("Rosa", "Arbusto");
        Planta planta2 = new Planta("Girasol", "Flor");

        
        Botanico botanico1 = new Botanico("Licencia1", "Nombre1", "Apellido1", "email1", "123456789");
        Botanico botanico2 = new Botanico("Licencia2", "Nombre2", "Apellido2", "email2", "987654321");

        
        Cuidado cuidado1 = new Cuidado(/* ... */); 
        Cuidado cuidado2 = new Cuidado(/* ... */); 
        planta1.agregarCuidado(cuidado1);
        planta2.agregarCuidado(cuidado2);

        
        cuidado1.asignarBotanico(botanico1);
        cuidado2.asignarBotanico(botanico2);

       
        System.out.println("Información del Centro Botánico:");
        System.out.println("---- Plantas Registradas ----");
        System.out.println(planta1);
        System.out.println(planta2);
        System.out.println("---- Botánicos Asignados ----");
        System.out.println(botanico1);
        System.out.println(botanico2);
        System.out.println("---- Cuidados Asignados ----");
        System.out.println("Cuidado 1:");
        System.out.println(cuidado1);
        System.out.println("Cuidado 2:");
        System.out.println(cuidado2);
    }
}