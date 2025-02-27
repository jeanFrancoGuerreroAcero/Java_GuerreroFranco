
package ligaBaloncesto;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        partido p1 = new partidoLiga(1);
        partido p2 = new partidoPlayOff(2);
        
        
        boolean bo = true;
        
        while(bo == true){
            System.out.println("---------------------------------------");
            System.out.println("BIENVENIDO A LA LIGA DE BALONCESTO TIBU");
            System.out.println("---------------------------------------");
            System.out.println("");
            
            System.out.println("A que tipo de partido deseas hacerle gestion");
            System.out.println("1. partido play off");
            System.out.println("2, partido liga");
            
            Scanner sc = new Scanner(System.in);
            int opcion= sc.nextInt();
            
            if(opcion == 1){
                System.out.println("");
                System.out.println("--------");
                System.out.println("PLAY OFF");
                System.out.println("--------");
                System.out.println("");
                
                System.out.println("Ingrese el equipo local");
                String local = sc.nextLine();
                
            }
        }
    }
}
