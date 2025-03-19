
package MVc;

import MVC.controlador.UsuarioControlador;
import Modelo.usuarioDAO;
import Vista.usuarioVista;
import java.nio.file.attribute.UserPrincipal;

public class main {
    public static void main(String[] args) {
        usuarioDAO usuarioDAO = new usuarioDAO();
        usuarioVista usuarioVista = new usuarioVista();
        UsuarioControlador usuarioControlador = new UsuarioControlador(usuarioDAO,usuarioVista);

        usuarioControlador.iniciar();
    }
}
