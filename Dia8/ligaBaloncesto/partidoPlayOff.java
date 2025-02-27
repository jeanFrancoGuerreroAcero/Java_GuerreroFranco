
package ligaBaloncesto;

import java.util.Date;

public class partidoPlayOff extends partido{
    private int ronda;

    public partidoPlayOff() {
    }

    public partidoPlayOff(int ronda) {
        this.ronda = ronda;
    }

    public partidoPlayOff(int ronda, int extra, String equipoLocal, String equipoVisitante, int cestasEquipolocal, int cestaEquipoVisitante, boolean partidofinalizado, Date fechapartido, String ganador) {
        super(equipoLocal, equipoVisitante, cestasEquipolocal, cestaEquipoVisitante, partidofinalizado, fechapartido, ganador);
        this.ronda = ronda;
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
            setGanador("No se permite empate en esta liga");
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
        System.out.println("jornada: " + ronda);
    }
    
    
    
}
