
package excersices_hilo;


public class Atleta {
    private String atleta;
    
    private static double tiempoT = 0;
    
    public Atleta(String relevo){
        relevo = relevo;
    }
    
    public Atleta(){
        tiempoT = 0;
    }
    
    public Atleta(String atleta){
        this.atleta = atleta; // Asignación correcta
    }

    public Atleta(){
        tiempoT = 0;
    }

    public static double getTiempo(){
        return tiempoT;
    }
    
    public void run() {
        double tiempo = 0;
        synchronized(getClass()) {
            if (tiempo == 0) {
                System.out.println("Comienza a correr " + getName());
                tiempo = (Math.random() * (11 - 9) + 9); // Tiempo aleatorio entre 9 y 11 segundos
                tiempoT += tiempo;
            } else {
                System.out.println("Pasa el relevo y comienza a correr " + getName());
                tiempo = (Math.random() * (11 - 9) + 9);
                tiempoT += tiempo;
            }
            System.out.println("El corredor: " + getName() + " ha tardado: " + tiempo);
        }
    }

    // Método para obtener el nombre del atleta
    public String getName() {
        return this.atleta;
    }

    public static void main(String[] args) throws InterruptedException {
        // Crear instancias de Atleta
        Atleta a1 = new Atleta("Pedro");
        Atleta a2 = new Atleta("Pablo");
        Atleta a3 = new Atleta("Usain");
        Atleta a4 = new Atleta("Manolo");

        // Iniciar los hilos de los atletas
        a1.start();
        a1.join();
        a2.start();
        a2.join();
        a3.start();
        a3.join();
        a4.start();
        a4.join();

        // Mostrar el tiempo total al final de la carrera
        System.out.println("Final de la carrera, tiempo total: " + Atleta.getTiempo());
    }
}