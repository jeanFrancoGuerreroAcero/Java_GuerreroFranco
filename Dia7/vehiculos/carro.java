
package vehiculos;

public class carro extends vehiculo{
    private int numeroPuertas;

    public carro() {
    }
    
    public carro(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public carro(int numeroPuertas, String marca, String modelo) {
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }
    
    @Override
    public void mostrarDetalles(){
        System.out.println("marca: " + getMarca());
        System.out.println("modelo: " + getModelo());
        System.out.println("numero de puertas: " + numeroPuertas);
    }
}
