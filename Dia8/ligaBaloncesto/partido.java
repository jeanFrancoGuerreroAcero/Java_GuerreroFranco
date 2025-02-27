
package ligaBaloncesto;

import java.util.Date;

public class partido {
    private String equipoLocal;
    private String equipoVisitante;
    private int cestasEquipolocal;
    private int cestaEquipoVisitante;
    private boolean partidofinalizado;
    private Date fechapartido;
    private String ganador;

    public partido() {
    }

    public partido(String equipoLocal, String equipoVisitante, int cestasEquipolocal, int cestaEquipoVisitante, boolean partidofinalizado, Date fechapartido, String ganador) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.cestasEquipolocal = cestasEquipolocal;
        this.cestaEquipoVisitante = cestaEquipoVisitante;
        this.partidofinalizado = partidofinalizado;
        this.fechapartido = fechapartido;
        this.ganador = ganador;
    }
    
    public String getEquipoLocal(){
        return equipoLocal;
    }
    
    public String getEquipoVisitante(){
        return equipoVisitante;
    }
    
    public int getcestasEquipolocal(){
        return cestasEquipolocal;
    }
    
    public int getcestasEquipoVisitante(){
        return cestaEquipoVisitante;
    }
    
    public boolean getPartidofinalizado(){
        return partidofinalizado;
    }
    
    public Date getFechapartido(){
        return fechapartido;
    }
    
    public String getGanador(){
        return ganador;
    }
    
    public void ganador(){
        if(cestasEquipolocal > cestaEquipoVisitante){
            ganador = equipoLocal;
        }
        else if(cestasEquipolocal < cestaEquipoVisitante){
            ganador = equipoVisitante;
        }
        else if(cestasEquipolocal == cestaEquipoVisitante){
            ganador = "Empate";
        }
        else{
            System.out.println("no es un dato valido");
        }
    }
    
    public void setEquipoLocal(){
        equipoLocal = equipoLocal;
    }
    
    public void setEquipoVisitante(){
        equipoVisitante = equipoVisitante;
    }
    
    public void setCestasEquipoLocal(){
        cestasEquipolocal = cestasEquipolocal;
    }
    
    public void setCestasEquipoVisitante(){
        cestaEquipoVisitante = cestaEquipoVisitante;
    }
    
    public void setPartidoFinaizado(){
        partidofinalizado = partidofinalizado;
    }
    
    public void setGanador(String ganador){
        ganador = ganador;
    }
    
    public void mostrarInformacion(){
        System.out.println("");
        System.out.println("Equipo local: " + equipoLocal);
        System.out.println("Cestas del equipo local: " + cestasEquipolocal);
        System.out.println("Equipo visitante: " + equipoVisitante);
        System.out.println("Cestas del equipo visitante: " + cestaEquipoVisitante);
        System.out.println("partido finalizado: " + partidofinalizado);
        System.out.println("Ganador: " + ganador);
    }
}
