
package SOLID_ISP;

public class good {

    interface Workable{
        void work();
    }
    
    interface Eatable{
        void eat();
    }
    
    class Human implements Workable, Eatable{
        public void work(){
            System.out.println("Trabajando...");
        }
        public void eat(){
            System.out.println("Comiendo...");
        }
    }
    
    class Robot implements Workable{
        public void work(){
            System.out.println("Trabajando");
        }
    }

    
}
