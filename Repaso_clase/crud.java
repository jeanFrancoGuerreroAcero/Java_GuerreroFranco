
package Repaso;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class crud {
    private static String archivo = "./src/Repaso/data.txt";
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
}
