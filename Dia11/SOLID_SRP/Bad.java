
package SOLID_SRP;


public class Bad {
    //1. Single Responsibiliti principle (SRP) - Principio de responsabilidad unica
    //una clase debe tener una unica razon para cambiar
    // es decir, debe encargarse de una sola responsabilidad
    class Report{
        public void generateReport(){
            //Genera un informe
        }
        
        public void saveToFile(String filename){
            // Guarda el informe en una archivo (Violacion de SRP)
            
        }
        
        //¿Que esta mal ? la clase report tienre dos responsabilidades:
        //Generar el informe y guardarlo en un archivo.
    }
}
