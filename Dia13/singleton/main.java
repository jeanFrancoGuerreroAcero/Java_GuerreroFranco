
package singleton;


//singleton
//garantiza que solo haya una instancia de una clase en todo el progama
public class main {
    static class Singleton{
        private static Singleton instancia;
        
        private Singleton(){}
        
        public static Singleton getInstancia(){
            if(instancia == null){
                instancia = new Singleton();
            }
            return instancia;
        }
        
        public void mostrarMensaje(){
            System.out.println("Instancia unica de singleton");
        }
    }
    
    public static void main(String[] args) {
        Singleton single1 = Singleton.getInstancia();
        Singleton single2 = Singleton.getInstancia();
        
        single1.mostrarMensaje();
        
        System.out.println(single1 == single2);
    }
    
}
