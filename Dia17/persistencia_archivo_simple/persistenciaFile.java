
package persistencia_archivo_simple;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class persistenciaFile {
    private static final String nombre_archivo = "./src/persistencia_archivo_simple/data.txt";
    
    //Metodo para guardar
    public static void guardarDatos(String contenido){
        try(FileWriter guardar = new FileWriter(nombre_archivo)){
            guardar.write(contenido);
            System.out.println("Datos fueron guardados de manera correcta!");
        }
        catch(IOException e){
            System.out.println("Error al momento de guardar: " + e.getMessage());
        }
    }
    
    //Metodo para leer
    public static void leerDatos(){
        try(BufferedReader lector = new BufferedReader(new FileReader(nombre_archivo))){
            String linea;
            System.out.println("contenido del archivo");
            while((linea = lector.readLine()) !=null){
                System.out.println(linea);
            }
        }
        catch(IOException e){
            System.out.println("Error al momento de importar el archivo" + e.getMessage());
        }
    }
}
