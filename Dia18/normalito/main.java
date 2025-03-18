
package normalito;

import java.util.List;
import normalito.usuarioDAO;

public class main {
    public static void main(String[] args) {
        usuarioDAO usuarioDao = new usuarioDAO();
        
        //insertar un usuario
       
        usuarioDao.insertUsuario("pedrito","pedro@gmail.com");
        
        
        usuarioDao.insertUsuario("maria","maria@gmail.com");
        
        usuarioDao.insertUsuario("valentina","valentina@gmail.com");
        
        System.out.println("ya se ingresaron los usuarios");
        
        

        List<String> listaUsuarios = usuarioDao.obtenerUsuarios();
        for(String usuario : listaUsuarios){
            System.out.println(usuario);
        }
        
        usuarioDao.actualizarUsuario(3, "jaime", "jaime@campusland.com");
        listaUsuarios=usuarioDao.obtenerUsuarios();
        
        for(String usuario : listaUsuarios){
            System.out.println(usuario);
        }
 
        usuarioDao.eliminarUsuario(2);
        
        List<String> listaUsuarios = usuarioDao.listarPorId(1);
        
        for(String usuario :listaUsuarios){
            System.out.println(usuario);
        }
    }
}
