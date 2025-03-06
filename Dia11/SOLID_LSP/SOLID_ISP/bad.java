
package SOLID_ISP;

public class bad {
    
interface worker {
    void work();
    void eat();
}    
    
    class Robot implements worker{
        public void work(){
            System.out.println("Trabajando...");
        }
        
        public void eat(){
            throw new UnsupportedOperationException(" !un robot no come!");
        }
    }
    
    
}
