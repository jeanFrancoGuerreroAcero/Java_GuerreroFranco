
package Decorator;

//Decorator (decorador)
//añade funcionalidades a un objeto sin modificar su estructura

//ejemplo:
//agregar caracteristicas extra a un cafe
public class main {
    //componente base
    interface Cofee{
        String getDescripcion();
        double cost();
    }
    
    //implementcion base
    static class SimpleCofee implements Cofee{
        public String getDescripcion(){
            return "cafe simple";
        }
        
        public double cost(){
            return 5.0;
        }
        
        //decoration abstracte
        static abstract class CoffeeDecorator implements Cofee{
            protected Cofee cofee;
            
            public CoffeeDecorator(Cofee cofee){
                this.cofee = cofee;
            }
            
            public String getDescripcion(){
                return cofee.getDescripcion();
            }
            
            public double cost(){
                return cofee.cost();
            }
  
        }
        
        static class MilkDecorator extends CoffeeDecorator{
            public MilkDecorator(Cofee cofee){super(cofee);}
            
            public String getDescripcion(){
                return cofee.getDescripcion() + ", con leche";}
            }
        
            public double cost(){return cofee.cost() + 1.5;}
        }
        
        //uso del patron decorator
        public static void main(String[] args) {
            Cofee mycofe = new SimpleCofee();
            System.out.println(mycofe.getDescripcion() + " $" + mycofe.cost());
            
           
        }
    }
}
