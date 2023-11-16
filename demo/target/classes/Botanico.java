package com.example;

public class Botanico{
    private String Licencia;
    private String NombreB;
    private String ApellidoB;
    private String Email;
    private String Celular;
  


    public Botanico (String Licencia, String NombreB,String ApellidoB, String Email, string Celular ){
        this.Licencia = Licencia;
        this.NombreB = NombreB;
        this.ApellidoB = ApellidoB;
        this.Email = Email;
        this.Celular = Celular;

    }

    public String getLicencia(){
        return Licencia;

    }

    public void setLicencia(String Licencia){
        this.Licencia = Licencia;
    }
    

    public String getNombreB(){
        return NombreB;

    }

    public void setNombreB(String NombreB){
        this.NombreB = NombreB;

    }
    public String getApellidoB(){
        return ApellidoB;

    }

    public void setApellidoB(String ApellidoB){
        this.ApellidoB = ApellidoB;
    }
    

    public String getEmail(){
        return Email;

    }
    
    public String getCelular(){
        return Celular;

    }

    public void setCelular(String Celular){
        this.Celular = Celular;
    }
    
   
    @Override

    public String toString (){
        return Super.toString()+"Licencia"+Licencia+ ",Nombre"+NombreB+",Apellido"+ApellidoB+",Email"+Email+"Celular"+Celular;

    }

    


}
  