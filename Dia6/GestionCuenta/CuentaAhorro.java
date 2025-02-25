
package GestionCuenta;

public class CuentaAhorro extends CuentaBancaria{
    private double tasaInteres;

    public CuentaAhorro() {
    }

    public CuentaAhorro(String codigo, String nombre, double saldo, double tasaInteres) {
        super(codigo, nombre, saldo);
        this.tasaInteres = tasaInteres;
    }
    
    public void aplicarInteres(){
        saldo = saldo + (saldo * tasaInteres / 100);
        System.out.println("El nuevo saldo aplicando el interes es: " + saldo);
    }
    
    
}
