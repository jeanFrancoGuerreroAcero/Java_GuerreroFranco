
package Producto;

public class Producto {
    private String codigo;
    private String nombre;
    private int cantidad;
    private double precio;

    public Producto(String codigo, String nombre, int cantidad, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public Producto() {
    }
  
    public String getCodigo(){
        return codigo;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getCantidad(){
        return cantidad;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public void setCantidad(){
        if(cantidad<0){
            System.out.println("La cantidad no puede ser negativa");
        }
        else if(cantidad>0){
            cantidad = cantidad;
            System.out.println("La cantidad del produto se cambio a: " + cantidad);
        }
        else{
            System.out.println("no es valido");
        }
    }
    
    
    public void setPrecio(double precio){
        if(precio<0){
            System.out.println("El precio no puede ser menor a 0");
        }
        else if(precio>0){
            precio = precio;
            System.out.println("LEl precio se cambio a: " + precio);
        }
        else{
            System.out.println("no es valido");
        }
    }
    
    public void actualizarStock(int num){
        if(cantidad + num<0){
            System.out.println("No se puede actualizar porqu el stock quedaria negativo");
        }
        else{
            cantidad += num;
            System.out.println("El stock es:" + cantidad);
        }
    }
    
    public void InventarioTest( double precio, int num1){
        cantidad += num1;
        System.out.println("Como se vendieron" + num1 + "El stock quedo en:" + cantidad);
        System.out.println("");
        precio = precio;
        System.out.println("El precio quedo en:" + precio);
        System.out.println("");
        System.out.println("----------");
        System.out.println("Inventario");
        System.out.println("----------");
        System.out.println("");
        System.out.println("codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio: " + precio);
    }
}
