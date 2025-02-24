
package Dia5;

public class Departamento {
    int id;
    int idpaciente;
    String nombre;
    int capacidad;
    
    public Departamento(int id, int idPaciente, String nombre, int capacidad){
        this.id = id;
        this.idpaciente = idPaciente;
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Departamento{" + "id=" + id + ", idpaciente=" + idpaciente + ", nombre=" + nombre + ", capacidad=" + capacidad + '}';
    }
}
