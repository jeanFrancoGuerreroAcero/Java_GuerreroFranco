
package GestionEmpleados;


public class empleadoHoras extends Empleado {
    private int horasExtras;

    public empleadoHoras() {
    }

    public empleadoHoras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public empleadoHoras(int horasExtras, String nombre, double salario) {
        super(nombre, salario);
        this.horasExtras = horasExtras;
    }

    

    @Override
    public void calcularBonificacion() {
        if(horasExtras > 30){
            System.out.println("Su bonificacion sera: " + getSalario() * 0.1);
        }
        else if(horasExtras > 60){
            System.out.println("Su bonificacion sera: " + getSalario() * 0.2);
        }
        else if(horasExtras > 90){
            System.out.println("Su bonificacion sera: " + getSalario() * 0.3);
        }
    }
    
    
}
