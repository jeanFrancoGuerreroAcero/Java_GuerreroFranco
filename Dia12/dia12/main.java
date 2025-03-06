
package Dia12;

public class main {
    
    //1. Mencione cuáles son los principios denominados SOLID y describa brevemente sus características.
        //*Single Responsability principle (SRP)
            //-Este principio tiene como prioridad la responsabilidad, cada clase debe realizar.
    
        //*Principio OPEN/CLOSED (OCP)
            //-Este principio tiene como prioridad establecer unas parametros y que al usar esta no se modifique la que ya esta establecida
    
        //Principio de sustitucion de Liskov (LSP)
            //-Este principio tiene como prioridad extraer las propiedades y comportamiento de la clase padre sin que afecte el correcto funcionamiento
            
        //Principio de segregacion de interfaz (ISP)
            //-Sugiere que se creen interfacez especificas para una finalidad eb concreto. En vez de tener una sola con varias clases
    
        //Principio de inversion de dependecias (DIP)
            //-Este principiodepende de absatracciones no de clases en concreto. Los modulos de alto nivel no deben depender de los modulos de bjo nivel.
    //3. Filtrado de clientes por atributo
    
    
    
    //6. Enviar email a contacto
        //se esta violando el principio de segregacion de interfaz (ISP)
    
        interface envio{
            void enviar();
        }
        
        class contacto{
            public String Nombre;
            public String CuentaBancaria;
            public String email;
        }
        
        class email implements envio{
            public void enviar(){
                System.out.println("Enviando email..");
            }
        }
    
    
}
