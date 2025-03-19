package MVC.controlador;

import Modelo.usuario;
import Modelo.usuarioDAO;
import Vista.usuarioVista;

import java.util.Scanner;

//Controlador
//Permite manejar los datos
// entre el modelo y la vista
public class UsuarioControlador {
    private usuarioDAO usuarioDao;
    private usuarioVista usuarioVistam;
    private Scanner scanner;

    public UsuarioControlador(usuarioDAO usuarioDao, usuarioVista usuarioVistaa) {
        this.usuarioDao = usuarioDao;
        this.usuarioVistam = usuarioVistaa;
        this.scanner = scanner = new Scanner(System.in);
    }

    public void iniciar(){
        while (true){
            System.out.println("Menu principal ");
            System.out.println("1. Crear usuario");
            System.out.println("2. Actualizar usuario");
            System.out.println("3. Eliminar usuario");
            System.out.println("4. Mostrar todos los usuarios");
            System.out.println(":");
            int opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    usuario nuevoUsuario = usuarioVistam.pedirUsuario();
                    usuarioDao.insertUsuario(nuevoUsuario);
                    System.out.println("Usuario Agregado!");
                    break;
                case 2:
                    usuario actualizarUsuario = usuarioVistam.actualizarusuario();
                    usuarioDao.actualizarUsuario(actualizarUsuario);
                    System.out.println("Usuario Agregado!");
                    break;
                case 3:
                    usuario usuarioElminado = usuarioVistam.eliminarUsuario();
                    usuarioDao.eliminarUsuario(usuarioElminado);
                    break;
                case 4:
                    usuarioVistam.mostrarUsuario();
                    break;
            }
        }
    }
}
