
package Repaso_clase;

import static Repaso.crud.*;
import java.util.Scanner;
import static persistencia_archivo_objeto.persistencia.agregarPersona;


public class main {
    public static void main(String[] args) {
        cargarDatos();
        
        Scanner sc = new Scanner(System.in);
        
        boolean ho = true;
        
        while(ho){
            System.out.println("\n--- CRUD Personas ---");
            System.out.println("1. Agregar Persona");
            System.out.println("2. Listar Personas");
            System.out.println("3. Actualizar Persona");
            System.out.println("4. Eliminar Persona");
            System.out.println("5. agregar Producto");
            System.out.println("6. listar Producto");
            System.out.println("7. actualizar Producto");
            System.out.println("4. Eliminar producto");
            System.out.println("9. Salir");
            System.out.print("Elige una opción: ");
            int opcion = sc.nextInt();
            
            if(opcion == 1){
                System.out.println("---------------");
                System.out.println("AGREGAR PERSONA");
                System.out.println("---------------");
                 System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // Limpiar buffer
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Edad: ");
                    int edad = sc.nextInt();
                    agregarPersona(id, nombre, edad);
                    guardarPersonas();
            }
            else if(opcion == 2){
                listarPersonas();
            }
            else if(opcion == 3){
                System.out.print("ID de la persona a actualizar: ");
                    int idActualizar = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nuevo nombre: ");
                    String nuevoNombre = sc.nextLine();
                    System.out.print("Nueva edad: ");
                    int nuevaEdad = sc.nextInt();
                    actualizarPersona(idActualizar, nuevoNombre, nuevaEdad);
                    guardarPersonas();
            }
            else if(opcion == 4){
                System.out.print("ID de la persona a eliminar: ");
                    int idEliminar = sc.nextInt();
                    eliminarPersona(idEliminar);
                    guardarPersonas();
            }
            else if(opcion == 5){
                System.out.println("---------------");
                System.out.println("AGREGAR PRODUCTO");
                System.out.println("---------------");
                 System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // Limpiar buffer
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Edad: ");
                    double precio = sc.nextDouble();
                    agregarProducto(id, nombre, precio);
                    guardarProductos();
            }
            else if(opcion == 6){
                listarProductos();
            }
            else if(opcion == 7){
                System.out.print("ID del producto a actualizar: ");
                    int idActualizar = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nuevo nombre: ");
                    String nuevoNombre = sc.nextLine();
                    System.out.print("Nueva precio: ");
                    double nuevoPrecio = sc.nextDouble();
                    actualizarProducto(idActualizar, nuevoNombre, nuevoPrecio);
                    guardarProductos();
            }
            else if(opcion == 8){
                System.out.print("ID del producto a eliminar: ");
                    int idEliminar = sc.nextInt();
                    eliminarProducto(idEliminar);
                    guardarProductos();
            }
            else if(opcion == 9){
                ho = false;
            }
        }
        
    }
    
}
