
package normalito;


public class Controlador {
    private usuarioDAO usuario;
    
    private Vista vermenu;

    public Controlador(usuarioDAO usuario, Vista vermenu) {
        this.usuario = usuario;
        this.vermenu = vermenu;
    }
    
    public void mostrarSegun(){
        int opcion = vermenu.getobtener();
        
        String para = usuario.vistaAgregarUsuario();
        if(opcion == 1){
            vermenu.setInformacion("hola");
        }
    }
}
