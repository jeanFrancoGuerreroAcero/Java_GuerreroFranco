
package Lambda;

import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;



public class main {
    public static void main(String[] args) {
        //funciones lambda
        //la funciones lambda son funciones o metodos en java que se representan de manera nonima pues se definen  en linea donde se vayan a autilizar.
        //Dichas funciones pueden recibir cero o mas argumentos y devolver una o ningun valor de retorno
        
        //sintaxis
        //(parametros) -> {cuerpo de la funcion}
        
        
        //Parámetros: Son los valores de entrada de la función. Operador ->: Separa los parámetros de la implementación. Cuerpo de la función: Es el código que se ejecutará.

        //Las expresiones lambda solo funcionan con interfaces funcionales, es decir, interfaces que tienen un único método abstracto.
        //Algunas interfaces funcionales predefinidas en java.util.function incluyen:

        //Function<T, R> -> Recibe un argumento y devuelve un resultado.
        //Consumer<T> -> Recibe un argumento y no devuelve nada.
        //Supplier<T> -> No recibe argumentos, pero devuelve un resultado.
        //Predicate<T> -> Recibe un argumento y devuelve true o false.

        //Consumer es una interfaz funcional que representa una operación que acepta un solo argumento de entrada y no devuelve ningún resultado.
        //La interfaz Consumer se utiliza comúnmente para realizar acciones o efectos secundarios sobre un objeto, como imprimirlo en la consola, agregarlo a una colección,
        //o cualquier otra operación que no requiera devolver un valor.
        Consumer<String> consumidor = saludo -> {
            //se declara una variable local llamada lenguaje
            String lenguaje = "java";
            
            //se importa el saludo concadenado con una cadena adicional
            System.out.println(saludo + " Bienvenido a " + lenguaje);
        };
        
        //se invoca el metodo del consumer con un argumento "HOLA PEPE"
        consumidor.accept("Hola pepe");
        
        
        //Creacion de un biConsumer<String, String> usando una expresion llamada
        BiConsumer<String,String> consumidor2 = (nombre, saludo) -> {
            //se declara una variable local llamada lenguaje
            String lengueaje = "java";
            
            System.out.println(saludo+" " + nombre + " Bienvenido a " + lengueaje + "!");
        };
        
        consumidor2.accept("pepe","hola");
        
        
        //La interfaz funcional Supplier<T> pertenece al paquete java.util.function y se utiliza para representar un proveedor de resultados.
        //Esta interfaz no toma ningún argumento y produce un resultado de tipo T. Es decir, se utiliza cuando se necesita generar o proporcionar un valor, pero no se tiene ningún argumento para hacerlo. 
        //Se puede pensar en ello como una fábrica que suministra datos.
        //Supongamos que se requiere generar un número aleatorio usando un Supplier
        
        Supplier<Integer> generadorAleatorio = () -> new Random().nextInt(100) + 1;

        // Obtener el resultado del Supplier
        int numeroAleatorio = generadorAleatorio.get();

        System.out.println("Número aleatorio: " + numeroAleatorio);
        
        
        //La interfaz funcional Function<T, q> pertenece al paquete java.util.function y se ustiliza
        //para crear un metodo no explicito, que recibe parametros y retorna un valor
        
        Function<String, Integer> sizeOf = (String s) -> {
            return s.length();
        };
        
        String mensaje ="holaaaaa";
        Integer longitud = sizeOf.apply(mensaje);
        System.out.println("longitud del mensaje: " + longitud);
        
        //La interfaz predicate<T> pertenece al paquete java.util.function y se utiliza
        //para retornar un valor booleano : Tue or False.
        
        Predicate<Integer> esPar = numero -> numero %2 == 0;
        
        System.out.println("¿4 es par? : " + esPar.test(4));
        System.out.println("¿7 es par? : " + esPar.test(7));
    }
}
