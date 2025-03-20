
package dia21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class Dia21 {
    public static void main(String[] args) {
        //streamof()
        Stream<String> animales = Stream.of("Pato", "Gato", "Perro");
        animales.forEach(e -> System.out.println(e));
        
        //A partir de un arreglo
        String[] miArreglo = {"Pato", "Gato", "Perro"};
        Stream<String> animales2 = Arrays.stream(miArreglo);
        animales2.forEach(e -> System.out.println(e));
        
        
        //stream builder
        Stream<String> animales3 = Stream.<String>builder()
        .add("Pato")
        .add("Gato")
        .add("Perro")
        .build();
        animales3.forEach(e -> System.out.println(e));
        
        
        //a partir de una coleccion
        List<String> lista = new ArrayList<>();
        lista.add("Pato");
        lista.add("Gato");
        lista.add("Perro");
        Stream<String> animales4 = lista.stream();
        animales4.forEach(e -> System.out.println(e));
        
        
        
    }
    
}
