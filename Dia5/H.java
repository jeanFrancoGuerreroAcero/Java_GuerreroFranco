
package Dia5;

import java.util.ArrayList;
import java.util.Scanner;

public class H {
    public static void main(String[] args) {
        
        paciente paciente1 = new paciente(1, "jean franco guerrero acero" , "franco" , "cll 3 crr 1", 18 , "2025-02-23");
        paciente paciente2 = new paciente(2, "maria lozano garay montes" , "maria" , "cll 2 crr 3", 32 , "2025-01-10");
        paciente paciente3 = new paciente(3, "james raul rodriguez " , "james" , "cll 2 crr 2", 22 , "2025-09-20");
        
        ArrayList<Object> listaPacientes = new ArrayList<>();
        
        listaPacientes.add(paciente1);
        listaPacientes.add(paciente2);
        listaPacientes.add(paciente3);
        
        grupos grupo1 = new grupos(1,1,1,1,1);
        grupos grupo2 = new grupos(2,2,2,2,2);
        grupos grupo3 = new grupos(3,3,3,3,3);
        
        ArrayList<Object> listaGrupos = new ArrayList<>();
        
        listaGrupos.add(grupo1);
        listaGrupos.add(grupo2);
        listaGrupos.add(grupo3);
        
        trabajador trabajador1 = new trabajador(1, "pepe perez", 12000, "2025-03-10", "Doctor");
        trabajador trabajador2 = new trabajador(2, "luis jose", 9000, "2025-03-10", "limpiador");
        trabajador trabajador3 = new trabajador(3, "leslie nicol", 13000, "2025-03-10", "Doctor");
        
        ArrayList<Object> listaTrabajador = new ArrayList<>();
        
        listaTrabajador.add(trabajador1);
        listaTrabajador.add(trabajador2);
        listaTrabajador.add(trabajador3);
        
        Hospital Hospial1 = new Hospital(1,1,"alexis parra",300);
        Hospital Hospital2 = new Hospital(2,2,"sebastian hernandez",400);
        Hospital Hospital3 = new Hospital(3,3,"marlon contreras",600);
        
        ArrayList<Object> listaHospital = new ArrayList<>();
        
        listaHospital.add(Hospial1);
        listaHospital.add(Hospital2);
        listaHospital.add(Hospital3);
        
        Departamento departamento1 = new Departamento(1, 1, "teo hernandez", 500);
        Departamento departamento2 = new Departamento(2, 2, "andres acero", 200);
        Departamento departamento3 = new Departamento(3, 3, "pepe perez", 600);
        
        ArrayList<Object> listaDepartamento = new ArrayList<>();
        
        listaDepartamento.add(departamento1);
        listaDepartamento.add(departamento2);
        listaDepartamento.add(departamento3);
                
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------");
        System.out.println("Bienvenido al hospital");
        System.out.println("----------------------");
        System.out.println("");
        
        boolean bo = true;
        
        while(bo == true){
            System.out.println("1. Añadir pasciente");
            System.out.println("2. ver pascientes");
            System.out.println("3. ver trabajadores");
            
            int opcion = sc.nextInt();
        
            switch (opcion) {
                case 1:
                    System.out.println("----------------");
                    System.out.println("Añadir pasciente");
                    System.out.println("----------------");
                    System.out.println("");
                    
                    System.out.println("Ingresa el id del pasciente");
                    int newIdPaciente = sc.nextInt();
                    
                    System.out.println("Ingresa el nombre del paciente");
                    String newNombrePaciente = sc.nextLine();
                    sc.nextLine();
                    
                    System.out.println("Ingresa el nombre pila");
                    String newNombrePilaPaciente = sc.nextLine();
                    
                    System.out.println("Ingresa la direccion del paciente");
                    String newDireccionPaciente = sc.nextLine();
                    
                    System.out.println("Ingresa la edad del paciente");
                    int newEdadPaciente = sc.nextInt();
                    
                    System.out.println("Ingresa la fecha de ingreso");
                    String newFechaIngresoPaciente = sc.nextLine();
                    
                    paciente paciente4 = new paciente(newIdPaciente, newNombrePaciente, newNombrePilaPaciente, newDireccionPaciente, newEdadPaciente, newFechaIngresoPaciente);
                    listaPacientes.add(paciente4);
                    break;
                case 2:
                    System.out.println("----------------");
                    System.out.println("ver pascientes");
                    System.out.println("----------------");
                    System.out.println("");
                    
                    for(int i = 0 ;i<listaPacientes.size();i++){
                        System.out.println(listaPacientes.get(i));
                    }
                    break;
                case 3:
                    System.out.println("----------------");
                    System.out.println("ver trabajadores");
                    System.out.println("----------------");
                    System.out.println("");
                    
                    for(int i = 0 ;i<listaPacientes.size();i++){
                        System.out.println(listaTrabajador.get(i));
                    }
                    break;
                default:
                    throw new AssertionError();
            }
            
        //fin del while    
        }
        
         
        
        
    }
    
}
