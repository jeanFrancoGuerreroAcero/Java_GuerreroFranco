
package Producto;

public class main {
    public static void main(String[] args) {
        
        Producto po1 = new Producto("1d22g" , "coca-cola" , 8 , 1.200);
        
        po1.setPrecio(1.3000);
        po1.actualizarStock(1);
        po1.InventarioTest(1222,2);
        
    }
}
