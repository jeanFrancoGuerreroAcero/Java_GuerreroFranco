
package composite;

//composite (Compuesto Tarrito rojo)
//permite tratar objetos individuales y composiciones de objetos
//de manera uniforme.

import java.util.ArrayList;
import java.util.List;


//Ejemplo: jerarquia de empleados
public class main {
    //componente
    static abstract class Employee{
        protected String name;
        protected String position;
        
        public Employee(String name, String position){
            this.name = name;
            this.position = position;
        }
        
        abstract void showDetails();
    }
    
    
    //hoja
    static class Developer extends Employee{
        public Developer(String name){
            super(name,"Desarrollador");
        }
        
        @Override
        void showDetails(){
            System.out.println(position + ": " + name);
        }
    }
    
    static class Manager extends Employee{
        private List<Employee> subordinates = new ArrayList<>();
        
        public Manager(String name){
            super(name, "Gerente");
        }
        
        public void addEmployee(Employee emp){
            subordinates.add(emp);
        }
        
        @Override
        void showDetails(){
            System.out.println(position + ": " + name);
            for (Employee e : subordinates){
                e.showDetails();
            }
        }
    }
    
    public static void main(String[] args) {
        Manager manager = new Manager("carlos");
        manager.addEmployee(new Developer("Ana"));
        manager.addEmployee(new Developer("juan"));
        
        manager.showDetails();
    }
}
