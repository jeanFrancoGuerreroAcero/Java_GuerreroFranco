
package Repaso_clase;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class crud {
    private static String archivo = "./src/Repaso_clase/data.txt";
    private static ArrayList<persona> personas = new ArrayList<>();
    private static ArrayList<producto> productos = new ArrayList<>();
    
    
    //cargar los datos persistentes
    public static void cargarDatos(){
        personas.clear();
        productos.clear();
        try(BufferedReader reader = new BufferedReader(new FileReader(archivo))){
            String linea;
            while((linea=reader.readLine())!= null){
                if(linea.startsWith("P,")){
                    personas.add(persona.fromString(linea));
                }
                else if(linea.startsWith("PR,")){
                    productos.add(producto.fromString(linea));
                }
            }
        }
        catch(Exception e){
            System.out.println("No se puede cargar el archivo. Se procede a crear uno nuevo");
        }
    }


    public static void listarPersonas(){
        if(productos.isEmpty()){
            System.out.println("no se puede listar las personas por que no hay");
        }
        else{
            for (persona persona : personas){
                System.out.println(persona);
            }
        }
    }
    
    public static void guardarPersonas() {
        try (FileWriter writer = new FileWriter(archivo)) {
            for (persona p : personas) {
                writer.write(p.toString() + "\n");
            }
        } catch (IOException e) {
            System.err.println("Error al guardar datos: " + e.getMessage());
        }
    }
     
    public static void guardarProductos() {
        try (FileWriter writer = new FileWriter(archivo)) {
            for (producto pr : productos) {
                writer.write(pr.toString() + "\n");
            }
        } catch (IOException e) {
            System.err.println("Error al guardar datos: " + e.getMessage());
        }
    }
    
    public static void listarProductos(){
        if(productos.isEmpty()){
            System.out.println("no se puede listar las personas por que no hay");
        }
        else{
            for (producto producto : productos){
                System.out.println(producto);
            }
        }
    }
    
    public static void agregarPersona(int id, String nombre, int edad) {
        personas.add(new persona(id, nombre, edad));
        guardarPersonas();
    }
    
    public static void actualizarPersona(int id, String nuevoNombre, int nuevaEdad) {
        for (persona p : personas) {
            if (p.getId() == id) {
                p.setNombre(nuevoNombre);
                p.setEdad(nuevaEdad);
                guardarPersonas();
                return;
            }
        }
        System.out.println("Persona con ID " + id + " no encontrada.");
    }
    
    public static void eliminarPersona(int id) {
        personas.removeIf(p -> p.getId() == id);
        guardarPersonas();
    }
    
    
    
    public static void agregarProducto(int id, String nombre, double precio) {
        productos.add(new producto(id, nombre, precio));
        guardarPersonas();
    }
    
    public static void actualizarProducto(int id, String nuevoNombre, double nuevoPrecio) {
        for (producto p : productos) {
            if (p.getId() == id) {
                p.setNombre(nuevoNombre);
                p.setPrecio(nuevoPrecio);
                guardarProductos();
                return;
            }
        }
        System.out.println("Producto con ID " + id + " no encontrado.");
    }
    
    public static void eliminarProducto(int id) {
        productos.removeIf(p -> p.getId() == id);
        guardarProductos();
    }
}
