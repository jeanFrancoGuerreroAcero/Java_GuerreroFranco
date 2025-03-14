
package Repaso;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "P," + id + "," + nombre + "," + edad;
    }
    
    public static persona fromString(String string){
        String[]split = string.split(",");
        return new persona(Integer.parseInt(split[1]), split[2], Integer.parseInt(split[3]));
    }
}