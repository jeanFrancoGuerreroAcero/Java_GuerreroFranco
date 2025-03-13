
package excersices_hilo;

import java.util.Random;


public class Atleta extends Thread{
   
    private String nombre;

    public Atleta(String nombre) {
        this.nombre = nombre;
    }   
    
    public void run() {
        synchronized (getClass()) {
            
            try{
                Random random = new Random();
                System.out.println(nombre + " Arranco");
                int testigo = random.nextInt(9000)+2000;
                Thread.sleep(testigo);
                System.out.println("el " + nombre + " termino la carrera " + "el tiempo de la carrera es: " + testigo/1000);
            }
            catch(InterruptedException e){
                getClass().notifyAll();
            }
            getClass().notifyAll();
        }
        
        
    }


    public static void main(String[] args) {
        Atleta at1 = new Atleta("juancho");
        Atleta at2 = new Atleta("jose");
        Atleta at3 = new Atleta("andrea");
        Atleta at4 = new Atleta("camilo");
        
        at1.start();
        at2.start();
        at3.start();
        at4.start();
    }
}