
package Repaso;


public class producto {
    private int id;
    private String nombre;
    private double precio;

    public producto(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "PR," + id + "," + nombre + "," + precio;
    }
    
    public static producto fromString(String String){
        String[]Listanueva = String.split(",");
        return new producto(Integer.parseInt(Listanueva[1]), Listanueva[2], Double.parseDouble(Listanueva[3]) );
    }
}
