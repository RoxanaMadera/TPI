
package TPI;


public class Pronostico {
    
    private Partido partido;
    private Equipo equipo;
    private NewEnum resultado;

    public Pronostico(Partido partido, Equipo equipo, NewEnum resultado) {
        this.partido = partido;
        this.equipo = equipo;
        this.resultado = resultado;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public NewEnum getResultado() {
        return resultado;
    }

    public void setResultado(NewEnum resultado) {
        this.resultado = resultado;
    }
    
    public int puntos(){
        Enum resultadoReal = this.partido.resultado(this.equipo);
        if(resultado.equals(resultadoReal)){
        return 1;
        } else {
            return 0;
        }
    }
    
    
            
}
