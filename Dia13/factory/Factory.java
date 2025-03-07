
package factory;


//fatory method
//una interfaz para crear objetos, pero permite a las subclases
//decidir que clase concreta instanciar. se usa para evitar la
//creacion directa de objetos con new

//Interfaz producto
interface producto{
    void usar();
}

class productoA implements producto{
    public void usar(){
        System.out.println("Usando producto A");
    }
}

class productoB implements producto{
    public void usar(){
        System.out.println("Usando producto B");
    }
}

public class Factory{
    class factory{
        public static producto crearProducto(String tipo){
           
            if(tipo.equalsIgnoreCase("A")){
            return new productoA();
            }
            else if(tipo.equalsIgnoreCase("B")){
                return new productoB();
            }
            throw new IllegalArgumentException("Tipo desconocido");
        }
    }
    
    public static void main(String[] args) {
        
        try{
            producto p1 = factory.crearProducto("A");
            p1.usar();

            producto p2 = factory.crearProducto("B");
            p2.usar();

            producto p3 = factory.crearProducto("c");
            p3.usar();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

