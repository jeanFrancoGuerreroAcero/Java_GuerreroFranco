
package Dia15.hilos;


public class main extends Thread{
    public static void main(String[] args) {
        
        Thread t1 = new pingPong("p");
        Thread t2 = new pingPong("s");
        
        t1.start();
        t2.start();
    }
}
