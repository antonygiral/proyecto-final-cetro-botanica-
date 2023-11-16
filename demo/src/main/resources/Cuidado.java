package Cuidado;


public class Cuidado {
    private String Especializacion;
    private date FechaHora;
    private list BotanicosAsignados;
    private String Resultado;
    private boolean Estado;
  


    public Botanico (String Especializacion, date FechaHora,list BotanicosAsignados, String Resultado, boolean Estado ){
        this.Especializacion = Especializacion;
        this.FechaHora = FechaHora;
        this.BotanicosAsignados = BotanicosAsignados;
        this.Resultado = Resultado;
        this.Estado = Estado;

    }

    public String getEspecializacion(){
        return Especializacion;

    }

    public void setEspecializacion(String Especializacion){
        this.Especializacion = Especializacion;
    }
    

    public String getFechaHora(){
        return FechaHora;

    }

    public void setFechaHora(date FechaHora){
        this.FechaHora = FechaHora;

    }
    public String getBotanicosAsignados(){
        return BotanicosAsignados;

    }

    public void setBotanicosAsignados(list BotanicosAsignados){
        this.BotanicosAsignados = BotanicosAsignados;
    }
    

    public String getResultado(){
        return Resultado;

    }
    
    public String getEstado(){
        return Estado;

    }

    public void setEstado(boolean Estado){
        this.Estado = Estado;
    }
    
   
    @Override

    public String toString (){
        return Super.toString()+"Especializacion"+Especializacion+ ",Fecha y hora"+FechaHora+",botanico"+BotanicosAsignados+",Resultado"+Resultado+"Estado"+Estado;

    }

    


}
  