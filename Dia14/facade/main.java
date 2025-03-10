
package facade;

//facade
//proporciona una interfaz siplificada a un conjunto de clases mas complejas.

public class main {
    static class Amplifier{
        void on(){System.out.println("Amplificador encendido");}
    }
    
    static class DVDPlayer{
        void play(){System.out.println("Reproduciendo DVD.");}
    }
    
    static class homeTheaterFacade {
        private Amplifier amp;
        private DVDPlayer dvd;
        
        public homeTheaterFacade(){
            this.amp = new Amplifier();
            this.dvd = new DVDPlayer();
        }
        
        public void watchMovie(){
            amp.on();
            dvd.play();
        }
       
    }
    public static void main(String[] args) {
        homeTheaterFacade homeThe = new homeTheaterFacade();
        homeThe.watchMovie();
    }
}
