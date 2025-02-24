
package Empleado;


public class main {
    public static void main(String[] args) {
        
        Empleado emple1 = new Empleado(1, "franco", 12000);
        
        emple1.setSalario(1000);
        
        emple1.setNombre("sebastian");
        
        System.out.println(emple1.getNombre());
        
        emple1.mostrarInformacion();
    }
}
