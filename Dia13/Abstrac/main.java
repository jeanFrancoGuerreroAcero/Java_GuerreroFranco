
package Abstrac;



//Abstrac Factory
//proporciona una interfaz para crear
//familias de objetos relacionados sin especificar sus clases concretas
//se usa para cuando hay multiples variantes de producto

//Interface de productos
interface Boton{
    void render();
}

interface Ventana{
    void abrir();
}

interface GUIFactory{
    Boton crearBoton();
    Ventana crearVentana();
}

public class main{
    static class BotonWindows implements Boton{
        public void render(){
            System.out.println("Renderizando boton estilo Windows");
        }
    }
    
    static class VentanaWindows implements Ventana{
        public void abrir(){
            System.out.println("Abriendo ventana estilo windows");
        }
    }
    
    static class BotonMac implements Boton{
       public void render(){System.out.println("Renderizando boton estilo mac");}
    }
    
    static class VentanaMac implements Ventana{
        public void abrir(){System.out.println("Abriendo ventana estilo mac");}
    }
    
    //fabricas cincretas
    static class WindowsFactory implements GUIFactory{
        public Boton crearBoton(){
            return new BotonWindows();
        }
        
        public Ventana crearVentana(){
            return new VentanaWindows();
        }
    }
    
    static class macFactory implements GUIFactory{
        public Boton crearBoton(){
            return new BotonMac();
        }
        
        public Ventana crearVentana(){
            return new VentanaMac();
        }
    }
    
    public static void main(String[] args) {
        GUIFactory factory = new WindowsFactory();
        Boton boton = factory.crearBoton();
        Ventana ventana = factory.crearVentana();
        
        boton.render();
        ventana.abrir();
    }
}

