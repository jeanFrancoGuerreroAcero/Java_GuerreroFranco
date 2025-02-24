
package Dia5;

public class paciente {
    int id;
    String nombre;
    String nombrePila;
    String direccion;
    int edad;
    String fechaIngreso;
    
    public paciente(){}
    
    public paciente(int id, String nombre, String nombrePila, String direccion,int edad, String fechaIngreso){
        this.id = id;
        this.nombre = nombre;
        this.nombrePila = nombrePila;
        this.direccion = direccion;
        this.edad = edad;
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return "paciente{" + "id=" + id + ", nombre=" + nombre + ", nombrePila=" + nombrePila + ", direccion=" + direccion + ", edad=" + edad + ", fechaIngreso=" + fechaIngreso + '}';
    }
    
}
