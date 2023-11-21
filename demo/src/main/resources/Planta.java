package  com.example;

public class Planta implements Planta {
    private String NombreP;
    private String TipoP;
    private list Cuidados;


    public Planta (String NombreP, String TipoP){
        this.NombreP = NombreP;
        this.TipoP = TipoP;
        this.Cuidados = Cuidados;

    }

    @Override
    public String getNombreP(){
        return NombreP;

    }

    @Override
    public void setNombreP(String NombreP){
        this.NombreP = NombreP;
    }
    

    @Override
    public String getTipoP(){
        return TipoP;

    }

    @Override
    public void setTipoP(String TipoP){
        this.TipoP = TipoP;

    }
    
    @Override
    public String getCuidados(){
        return Cuidados;

    }

    @Override
    public void setcuidados(list cuidados){
        this. Cuidados = Cuidados;
    }
    @Override

    public String toString (){
        return Super.toString()+"Nombre"+NombreP+ ",Tipo"+TipoP;

    }

    @Override
    public void AgregarCuidado(Cuidados Cuidado){
        Cuidados.add(Cuidado);
    }


}
  