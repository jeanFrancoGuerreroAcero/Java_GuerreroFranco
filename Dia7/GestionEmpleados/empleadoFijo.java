
package GestionEmpleados;

public class empleadoFijo extends Empleado{
    private String cargo;

    public empleadoFijo() {
    }

    public empleadoFijo(String cargo) {
        this.cargo = cargo;
    }

    public empleadoFijo(String cargo, String nombre, double salario) {
        super(nombre, salario);
        this.cargo = cargo;
    }
    
    @Override
    public void calcularBonificacion() {
        if(cargo == "cajero"){
            System.out.println("Su bonificacion sera: " + getSalario() * 0.1);
        }
        else if(cargo == "surtido"){
            System.out.println("Su bonificacion sera: " + getSalario() * 0.2);
        }
        else if(cargo == "bodegero"){
            System.out.println("Su bonificacion sera: " + getSalario() * 0.3);
        }
    }
}
