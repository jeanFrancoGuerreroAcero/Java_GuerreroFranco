
package SOLID_LSP;

public class bad {
    class bird{
        public void fly(){
            System.out.println("volando...");
        }
    }
    class penguin extends bird{
        @Override
        public void fly(){
            System.out.println("Nadando...");
        }
    }
}
