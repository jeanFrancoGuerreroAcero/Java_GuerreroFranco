
package persistencia_archivo_objeto;

public class persona {
    private int id;
    private String nombre;
    private int edad;

    public persona(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    @Override
    public String toString(){
        return id + "" + nombre + "" + edad;
    }
    
    public static persona fromString(String data){
        String[] parts = data .split(",");
        return new persona(Integer.parseInt(parts[0]), parts[1], Integer.parseInt(parts[2]));
    }
}
