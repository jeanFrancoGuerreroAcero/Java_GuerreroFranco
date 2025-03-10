
package Adapter;

//Adapter
//Convierte la interfaz de una clase en otra interfaz esperada por el cliente
//permite que las clases incompatibles trabajen juntas.


//contexto
//supongamos que tenemos un sistema antiguo que usa Vol120 y
//queremos adaptarlo a un sistema moderno que usa Vol12.
public class main {
    
    interface Volt12{
        int getVolt12();
    }
    
    static class Volt120{
        int getVolt120(){
            return 120;
        }
    }
    
    static class VoltAdapter implements Volt12{
        private Volt120 volt120;
        
        public voltAdapter(Volt120 volt12){
            this.volt120 = volt120;
        }
        
        @Override
        public int getVolt12(){
            return volt120.getVolt120()/10;
        }
        
        //uso del adaptador
        public static void main(String[] args) {
            Volt120 oldSystem = new Volt120();
            Volt12 VoltAdaptedSystem = new VoltAdapter(oldSystem);
            
            System.out.println("Voltaje adaptado" );
        }
    }
}
