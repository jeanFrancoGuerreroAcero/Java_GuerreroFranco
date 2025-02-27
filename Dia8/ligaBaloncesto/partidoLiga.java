
package ligaBaloncesto;

import java.util.Date;

public class partidoLiga extends partido{
    private int jornada;

    public partidoLiga() {
    }

    public partidoLiga(int jornada) {
        this.jornada = jornada;
    }

    public partidoLiga(int jornada, String equipoLocal, String equipoVisitante, int cestasEquipolocal, int cestaEquipoVisitante, boolean partidofinalizado, Date fechapartido, String ganador) {
        super(equipoLocal, equipoVisitante, cestasEquipolocal, cestaEquipoVisitante, partidofinalizado, fechapartido, ganador);
        this.jornada = jornada;
    }
    
    @Override
    public void ganador(){
        if(getcestasEquipolocal() > getcestasEquipoVisitante()){
            setGanador(getEquipoLocal());
        }
        else if(getcestasEquipolocal() < getcestasEquipoVisitante()){
            setGanador(getEquipoVisitante());
        }
        else if(getcestasEquipolocal() == getcestasEquipoVisitante()){
            setGanador("Empate");
        }
        else{
            System.out.println("no es un dato valido");
        }
    }
    
    public void mostrarInformacion(){
        System.out.println("");
        System.out.println("Equipo local: " + getEquipoLocal());
        System.out.println("Cestas del equipo local: " + getcestasEquipolocal());
        System.out.println("Equipo visitante: " + getEquipoVisitante());
        System.out.println("Cestas del equipo visitante: " + getcestasEquipoVisitante());
        System.out.println("partido finalizado: " + getPartidofinalizado());
        System.out.println("Ganador: " + getGanador());
        System.out.println("jornada: " + jornada);
    }
    
}
