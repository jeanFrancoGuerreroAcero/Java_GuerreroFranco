
package GestionEmpleados;

public class Empleado {
    private String nombre;
    private double salario;

    public Empleado() {
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public double getSalario(){
        return salario;
    }

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
    
    public void calcularBonificacion(){
        System.out.println("Su bonificacion sera" + salario * 0.1);
    }
    
}
