
package a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class naturales_1_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ejercicio 1 imprimir los numeros naturales de 1 hasta n
        /*
        int l = 0;
        int n = sc.nextInt();
        
        for(int i = 0;i<n;i++){
            l++;
            System.out.println(l);
        }
        
        
        // ejercicio 2 inprimir los numeros naturales de n hasta 0
        int entero = sc.nextInt();

        for(int i = entero;i>=0;i--){
            entero--;
            System.out.println(i);
        }
        
        //ejercicio 3 inmprimir las tablas de multiplicar
        
        int multiplicando = 1;
        int multiplicador = 1;
        
        while(multiplicando <= 10){
            while(multiplicador<=10){
                int producto = multiplicando * multiplicador;
                System.out.println(multiplicando + " x " + multiplicador + " = " + producto);
                multiplicador++;
            }   
            System.out.println("");
            multiplicador=1;
            multiplicando++;
        }
        
        //ejercico 4 Escribe un programa para imprimir tablas de multiplicar en orden inverso.
        System.out.println("");
        
        int mulInversando = 10;
        int mulInversador = 1;
        
        while(mulInversando >= 1){
            while(mulInversador <=10){
                int produc = mulInversando * mulInversador;
                System.out.println(mulInversando + " x " + mulInversador + " = " + produc);
                mulInversador++;
            }
            System.out.println("");
            mulInversador=1;
            mulInversando--;
        }
        
        
        //ejercicio 5 Escribe un programa para imprimir todas las letras del alfabeto de la 'a' a la 'z'.
        ArrayList<String> abecedario = new ArrayList<>();
        
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        for(int i = 0; i<letras.length();i++){
            abecedario.add(String.valueOf(letras.charAt(i)));
        }
        
        for(int i = 0;i<abecedario.size();i++){
            System.out.print(abecedario.get(i) + " ");
        }
        System.out.println("");
        
        //ejercico 6 Escribe un programa para imprimir el alfabeto en orden inverso, de la 'Z' a la 'A'.
        
        Collections.reverse(abecedario);
        
        for(int i = 0;i<abecedario.size();i++){
            System.out.print(abecedario.get(i) + " ");
        }
        
        //ejercicio 7 Escribe un programa para imprimir todos los números pares entre 1 y 100.
        
        
        for(int i = 0; i<=100;i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }
        
                
        //ejercicio 8 Escribe un programa para imprimir todos los números impares entre 1 y 100
        for(int i = 0;i<=100;i++){
            if(i%2 !=0){
                System.out.println(i);
            }
        }
        
        //ejercicio 9 Escribe un programa para encontrar la suma de todos los números naturales entre 1 y n
        int nu = sc.nextInt();
        for(int i = 0; nu<100;i++){
            int re = nu + 1;
            System.out.println(re);
            nu++;
        }
        
        //ejercicio 10 Escribe un programa para encontrar la suma de todos los números pares entre 1 y n.
        int na = sc.nextInt();
        int fin = 0;
        for(int i = 1;i< na;i++){
            if(i %2 == 0){
                fin += i;
            }
        }
        System.out.println(na + fin);
        
        //ejercicio 11 Escribe un programa para encontrar la suma de todos los números impares entre 1 y n.
        int na1 = sc.nextInt();
        int fin1 = 0;
        for(int i = 1;i< na1;i++){
            if(i %2 != 0){
                fin1 += i;
            }
        }
        System.out.println(na1 + fin1);
        
        //ejercicio 12 Escribe un programa para imprimir los valores ASCII
        for(int i = 0;i <= 255; i++){
            System.out.println("ASCII" + i + " = " + (char)i);
        }
        //ejercicio 13 Escribe un programa para encontrar el factorial de cualquier número.
        int factorial = sc.nextInt();
        int stand = 1;
        for(int i = 1;i<= factorial;i++){
            stand = stand * i;
        }
        System.out.println(stand);
        
        //ejercicio 14 Escribe un programa para calcular el valor de un número elevado a la potencia de otro.
        int potencia1 = sc.nextInt();
        int potencia2 = sc.nextInt();
        int re = 1;
        for(int i = 1;i<=potencia2;i++){
            re *= potencia1;
        }
        System.out.println(re);
        
        //ejercicio 15 Escribe un programa para invertir los dígitos de un número dado.
        int digitoIn = sc.nextInt();
        int digitoIn2 = 0;
        
        for(;digitoIn != 0; digitoIn /= 10){
            int dado = digitoIn % 10;
            digitoIn2 = digitoIn2 * 10 + dado;
        }
        System.out.println("numero invertido: " + digitoIn2);
        //ejercicio 16 Escribe un programa para calcular la suma de los dígitos de un número.
        System.out.println("Ingresa un numero;");
        int invertido = sc.nextInt();
        int invertidoSuma = 0;
        
        for(;invertido > 0; invertido/=10){
            invertidoSuma += invertido %10;
        }
        
        System.out.println(invertidoSuma);
        //ejercicio 17 Escribe un programa para verificar si un número dado es primo o no.
        int nuPri  = sc.nextInt();
        
        boolean pri = true;
        
        if(nuPri<= 1){
            pri = false;
        }
        else{
            for (int i = 2; i <= nuPri/2; i++) {
                if (nuPri % i == 0) {
                    pri = false;
                    break;
                }
            }
        }
        if(pri){
            System.out.println("Es primo");
        }
        else{
            System.out.println("No Es primo");
        }

        //ejercicio 18 Escribe un programa para calcular el MCD (Máximo Común Divisor) de dos números dados
        int rur = sc.nextInt();
        int rur2 = sc.nextInt();
        
        int rurMcd = 1;
        
        for(int i =1;i <= Math.min(rur,rur2);i++){
            if(rur % i ==0 && rur2 % i == 0){
                rurMcd=i;
            }
        }
        System.out.println("el mcd de " + rur + " y de " + rur2 + " es " + rurMcd);

        //ejercicio 19 Escribe un programa que permita ingresar números hasta que el usuario lo desee y, al final, muestre la cantidad de números positivos, negativos y ceros ingresados.
        int entrada = sc.nextInt();
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
           
        if(entrada>0){
        positivos++;
        }
        else if(entrada<0){
            negativos++;
        }
        else{
            ceros++;
        }
        System.out.println("cantidad positivos " + positivos);
        System.out.println("cantidad negativos " + negativos);
        System.out.println("cantidad ceros " + ceros);
        */
        //ejercicio 20 Escribe un programa que permita ingresar números hasta que el usuario lo desee y, al final, muestre el número más grande y el más pequeño ingresado.
        System.out.println("Cuantos numeros desea añadir");
        int cuan = sc.nextInt();
        
        ArrayList<Integer> mayorMenor = new ArrayList<>();
        
        for(int i = 0; i<cuan;i++){
            int guarde = sc.nextInt();
            mayorMenor.add(guarde);
        }
        
        int mayor = 0;
        int menor = 100;
        
        
        for(int i = 0;i<mayorMenor.size();i++){
            if(mayorMenor.get(i)<menor){
                menor = mayorMenor.get(i);
            }
            else if(mayorMenor.get(i)>mayor){
                mayor = mayorMenor.get(i);
            }
        }
        
        System.out.println("mayor " + mayor + " menor " + menor);
        
        
        //ejercicio 21 Escribe un programa para encontrar los números y la suma de todos los enteros entre 100 y 200 que sean divisibles por 9. 
        int s = 0;
        
        System.out.println("Numeros divisibles por 9 entre 100 y 200:");
        for (int i = 100; i <=200;i++){
            if(i % 9 == 0){
                System.out.println(i);
                s++;
            }
        }
        
        System.out.println("divisibles por 9 son :" + s);
        
        //ejercicio 22 Escribe un programa para convertir un número binario a decimal sin usar arreglos, funciones ni bucles while
        
        //ejercicio 24 Escribe un programa para convertir un número hexadecimal a decimal
        System.out.println("Ingresa un numero exadecimal para convertirlo a decimal");
        sc.nextLine();
        String hex1 = sc.nextLine();
        int decima12 = Integer.parseInt(hex1, 16);
        System.out.println("El numero decimal es: " + decima12);
        
        //ejercicio 25 Escribe un programa para convertir un número hexadecimal a octal
        System.out.println("Ingresa un numero exadecimal para convertirlo a octal");
        String hexadecimal1 = sc.nextLine();
        int hedecima1 = Integer.parseInt(hexadecimal1, 16);
        String octal = Integer.toOctalString(hedecima1);
        System.out.println("El numero octal es: " + octal);
        
        //ejercicio 26 Escribe un programa para convertir un número decimal a binario.
        
        
        //ejercicio 38 Escribe un programa para imprimir la serie de Fibonacci hasta n términos.
        int fibona = sc.nextInt();
        int aFibo=0,bFibo =1;
        
        for (int i = 0;i<fibona;i++){
            System.out.println(aFibo+"");
            
            int t = aFibo;
            aFibo = bFibo;
            bFibo = bFibo + t;
        }
    }
    
}
