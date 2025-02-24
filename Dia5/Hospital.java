
package Dia5;

public class Hospital {
    int id;
    int idPaciente;
    String nombre;
    int capacidad;
    
    public Hospital(int id, int idPaciente, String nombre, int capacidad){
        this.id = id;
        this.idPaciente = idPaciente;
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Hospital{" + "id=" + id + ", idPaciente=" + idPaciente + ", nombre=" + nombre + ", capacidad=" + capacidad + '}';
    }
}
