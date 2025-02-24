
package Empleado;

public class Empleado {
    private int id;
    private String nombre;
    private double salario;

    public Empleado(int id, String nombre, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.salario = salario;
    }

    public Empleado() {
    }
    
    public int getId(){
        return id;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public double salario(){
        return salario;
    }
    
    public void setSalario(double salario){
        if(salario>=0){
            salario = salario;
            System.out.println("Se cambio su salario a:" + salario);
        }
        else if(salario<0){
            System.out.println("No se puede cambiar su salario a negativo");
        }
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void mostrarInformacion(){
        System.out.println(id + " " + nombre + " "+ salario);
    }
    
}
