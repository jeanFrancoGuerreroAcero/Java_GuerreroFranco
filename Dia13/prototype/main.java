
package prototype;

//prototype
//se usa para clonar objetos sin acloplar a sus codigos concretos.
//java proporciona cloneable para esto

public interface main {
    static class persona implements Cloneable {
        private String nombre;
        private int edad;

        public persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }
        
        public void mostrarInformacion(){
            System.out.println("Persona: " + nombre + ", edad: " + edad);
        }
        
        @Override
        protected Object clone() throws CloneNotSupportedException{
            return super.clone();
        }
    }
    
    //use 
    public static void main(String[] args){
        try{
            persona p1 = new persona("franco",18);
            persona p2 = (persona) p1.clone();//clonando objetos
            
            p1.mostrarInformacion();
            p2.mostrarInformacion();
        }
        catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
