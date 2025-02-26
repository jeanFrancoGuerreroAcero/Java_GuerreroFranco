
package vehiculos;

public class main {
    public static void main(String[] args) {
        vehiculo moto1 = new moto("rojo");
        vehiculo carro1 = new carro(4);
        
        moto1.mostrarDetalles();
        carro1.mostrarDetalles();
    }
    
}
