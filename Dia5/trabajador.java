
package Dia5;

public class trabajador {
    int id;
    String nombre;
    int salario;
    String fechaVinculaacion;
    String cargo;
    
    public trabajador(int id, String nombre, int salario, String fechaVinculacion, String cargo){
        this.id = id;
        this.nombre = nombre;
        this.salario = salario;
        this.fechaVinculaacion = fechaVinculacion;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "trabajador{" + "id=" + id + ", nombre=" + nombre + ", salario=" + salario + ", fechaVinculaacion=" + fechaVinculaacion + ", cargo=" + cargo + '}';
    }
    
}
