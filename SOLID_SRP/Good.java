
package SOLID_SRP;

public class Good {
    class Report{
        public void generateReport(){
            // Genera un informe
        }
    }
    
    class reportSaver{
        public void saveToFile(String filename, Report report){
            // Guarda el informe en un archivo
        }
    }
}
