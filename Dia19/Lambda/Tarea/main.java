
package normalito;

import java.util.List;
import normalito.usuarioDAO;

public class main {
    public static void main(String[] args) {
        Vista vista = new Vista();
        
        Controlador controlador = new Controlador(new usuarioDAO(), vista);
        
        vista.setVisible(true);
    }
}
