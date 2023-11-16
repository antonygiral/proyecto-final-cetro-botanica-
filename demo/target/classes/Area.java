package Area;



public class Area {

    private String NombreA;
    private String Ubicacion;
    


    public Botanico (String NombreA, String Ubicacion){
        this.NombreA = NombreA;
        this.Ubicacion = Ubicacion;
      

    }

    public String getNombreA(){
        return NombreA;

    }

    public void setNombreA(String NombreA){
        this.NombreA = NombreA;
    }
    

    public String getUbicacion(){
        return Ubicacion;

    }

    public void setUbicacion(String Ubicacion){
        this.Ubicacion = Ubicacion;

    }
  
    
   
    @Override

    public String toString (){
        return Super.toString()+"NombreA"+NombreA+ ",Nombre"+Ubicacion;

    }

    


}
  
    
