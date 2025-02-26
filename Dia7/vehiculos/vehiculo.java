
package vehiculos;

public class vehiculo {
    private String marca;
    private String modelo;

    public vehiculo() {
    }
    
    public String getMarca(){
        return marca;
    }
    
    public String getModelo(){
        return modelo;
    }

    public vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public void mostrarDetalles(){
        System.out.println("marca: " + marca);
        System.out.println("modelo: " + modelo);
    }
    
    
}
