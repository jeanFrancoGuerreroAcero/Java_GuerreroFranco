
package Dia5;

public class grupos {
    int id;
    int idMedicoLider;
    int idDoctoresAsociados;
    int idDoctoresJunior;
    int idDoctoresSenior;
    
    public grupos(int id, int idMedicoLider, int idDoctoresAsociados, int idDoctoresJunior, int idDoctoresSenior){
        this.id = id;
        this.idMedicoLider = idMedicoLider;
        this.idDoctoresAsociados = idDoctoresAsociados;
        this.idDoctoresJunior = idDoctoresJunior;
        this.idDoctoresSenior = idDoctoresSenior;
    }

    @Override
    public String toString() {
        return "grupos{" + "id=" + id + ", idMedicoLider=" + idMedicoLider + ", idDoctoresAsociados=" + idDoctoresAsociados + ", idDoctoresJunior=" + idDoctoresJunior + ", idDoctoresSenior=" + idDoctoresSenior + '}';
    }
}