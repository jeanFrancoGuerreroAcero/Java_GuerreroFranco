
package vehiculos;

public class moto extends vehiculo{
    private String color;

    public moto() {
    }
    
    public moto(String color) {
        this.color = color;
    }

    public moto(String color, String marca, String modelo) {
        super(marca, modelo);
        this.color = color;
    }
    
    @Override
    public void mostrarDetalles(){
        System.out.println("marca: " + getMarca());
        System.out.println("modelo: " + getModelo());
        System.out.println("numero de puertas: " + color);
    }
    
    
}
