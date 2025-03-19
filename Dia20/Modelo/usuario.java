
package Modelo;


public class usuario {
    private int id;
    private String nombre;
    private String email;

    public usuario() {
    }
    
    
    
    public usuario(int id) {
        this.id = id;
    }

    public usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }
    
    public usuario(int id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return id +
                " - " + nombre +
                " - " + email;
    }
    
    
}
