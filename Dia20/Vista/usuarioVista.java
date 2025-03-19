
package Vista;

import Modelo.usuario;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Modelo.usuarioDAO;


public class usuarioVista {
    public void mostrarusuario(List<usuario> usuarios){
        System.out.println("Lista de usuarios");
        for(usuario u: usuarios){
            System.out.println(u);
        }
    }
    
    public usuario pedirUsuario(){
        System.out.println("Datos para nuevo usuario");
        System.out.println("Nombre");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        System.out.println("Email");
        String email = sc.nextLine();
        return new usuario(nombre,email);
    }
    
    public usuario actualizarusuario(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Datos para nuevo usuario actualizado");
        System.out.println("Id");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nombre");
        String nombre = sc.nextLine();
        System.out.println("Email");
        String email = sc.nextLine();
        return new usuario(id,nombre,email);
    }
    
    public usuario eliminarUsuario(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Id para eliminar usuario");
        System.out.println("Id");
        int id = sc.nextInt();
        return new usuario(id);
    }
    
    public void mostrarUsuario(){
        List<String> listaUsuarios = usuarioDAO.obtenerUsuarios();
        
        for(String usuario: listaUsuarios){
            System.out.println(usuario);
        }
        
        
    }
}
