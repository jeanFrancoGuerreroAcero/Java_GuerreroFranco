
package GestionCuenta;

public class main {
    public static void main(String[] args) {
        
        CuentaAhorro c1 = new CuentaAhorro("AE12R", "franco", 1.200,5);
        
        c1.depositar(1);
        
        c1.retirar(1);
        
        c1.aplicarInteres();
    }
}
