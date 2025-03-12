
package Dia15.hilos;

public class pingPong extends Thread{
    private String word;
    public pingPong(String s){
        word=s;
    }
    
    public void run(){
        for(int i = 0;i<3000;i++){
            System.out.println(word);
            System.out.flush();
        }
    }
}