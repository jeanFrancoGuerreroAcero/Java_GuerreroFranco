
package GestionCuenta;

public class CuentaBancaria {
    private String codigo;
    private String nombre;
    protected double saldo;

    public CuentaBancaria() {
    }

    public CuentaBancaria(String codigo, String nombre, double saldo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.saldo = saldo;
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void depositar(double nuevo){
        if(nuevo>0){
            saldo = saldo + nuevo;
            System.out.println("El deposito fue realizado ");
            System.out.println("El saldo es: " + saldo);
        }
        else{
            System.out.println("No estas depositando dinero a la cuenta");
        }
    }
    
    public void retirar(double cantidad){
         if(cantidad > 0 && cantidad <= saldo){
            saldo = saldo - cantidad;
            System.out.println("Su retiro fue realizado!");
            System.out.println("El saldo es: " + saldo);
        } else if(cantidad > saldo){
            System.out.println("No tienes los fondos suficientes.");
        } else{
            System.out.println("Por favor debes ingresar una cantidad válida.");
        }
         
    }
            
}
