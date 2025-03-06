
package SOLID_LSP;

abstract class bird{}
public class good {
    
    class fliyingBird extends bird{
        public void fly(){
            System.out.println("volando...");
        }
    }
    
    class pinguin extends bird{
        public void swim(){
            System.out.println("nadando...");
        }
    }
}
