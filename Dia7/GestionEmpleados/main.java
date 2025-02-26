
package GestionEmpleados;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Empleado empleado1 = new empleadoFijo( "cajero", "juancho" , 12000000);
        Empleado empleado2 = new empleadoHoras(31, "jose" , 30000);
        
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
       
        listaEmpleados.add(empleado1);
        listaEmpleados.add(empleado2);
        
        
        
        for(int i = 0 ;i<listaEmpleados.size();i++){
           listaEmpleados.get(i).calcularBonificacion();
        }
    }
}
