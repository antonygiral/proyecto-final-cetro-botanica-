package Planta;

public class Planta {
    private String NombreP;
    private String TipoP;
    private list Cuidados;


    public Planta (String NombreP, String TipoP){
        this.NombreP = NombreP;
        this.TipoP = TipoP;
        this.Cuidados = Cuidados;

    }

    public String getNombreP(){
        return NombreP;

    }

    public void setNombreP(String NombreP){
        this.NombreP = NombreP;
    }
    

    public String getTipoP(){
        return TipoP;

    }

    public void setTipoP(String TipoP){
        this.TipoP = TipoP;

    }
    
    public String getCuidados(){
        return Cuidados;

    }

    public void setcuidados(list cuidados){
        this. Cuidados = Cuidados;
    }
    @Override

    public String toString (){
        return Super.toString()+"Nombre"+NombreP+ ",Tipo"+TipoP;

    }

    public void AgregarCuidado(Cuidados Cuidado){
        Cuidados.add(Cuidado);
    }


}
  