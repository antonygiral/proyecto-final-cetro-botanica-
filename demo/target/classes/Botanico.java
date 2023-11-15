

package Botanico;

public class Botanico{
    private String Nombre;
    private String Tipo;
    private list <Cuidados> Cuidados;


    public Planta (String Nombre, String Tipo){
        this.Nombre = Nombre;
        this.Tipo = Tipo;
        this.Cuidados = Cuidados;

    }

    public String getNombre(){
        return Nombre;

    }

    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    

    public String getTipo(){
        return Tipo;

    }

    public void setTipo(String Tipo){
        this.Tipo = Tipo;

    }
    
    public String getCuidados(){
        return Cuidados;

    }

    public void setcuidados(list cuidados){
        this. Cuidados = Cuidados;
    }
    @Override

    public String toString (){
        return Super.toString()+"nombre"+Nombre+ ",tipo"+Tipo;

    }

    public void AgregarCuidado(Cuidados Cuidado){
        Cuidados.add(Cuidado);
    }


}
  