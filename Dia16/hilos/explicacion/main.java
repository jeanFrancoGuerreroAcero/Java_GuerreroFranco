/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dia15.hilos.explicacion;


public class main {
    public static void main(String[] args) {
        counter cont1 = new counter();
        counter cont2 = new counter();
        
        cont1.start();
        cont2.start();
        
        System.out.println("valor del contador final 1:" + cont1.value());
        System.out.println("valor del contador final 2:" + cont2.value());
    }
}
