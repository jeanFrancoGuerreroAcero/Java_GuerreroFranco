
package Dia15.hilos.explicacion;


public class counter extends Thread{
    private int c = 0;
    public synchronized void increment(){
        c++;
    }
    
    public synchronized void decrement(){
        c--;
    }
    
    public void run(){
        for(int i = 0;i<30000;i++){
            increment();
            decrement();
        }
    }
    
    public synchronized int value(){
        return c;
    }
}
