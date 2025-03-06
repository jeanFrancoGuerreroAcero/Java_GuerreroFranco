
package SOLID_OCP;

public class Bad {
    //Open/CLOSED principle (OCP) - Principio Abierto/Cerrado
    //LAs claves deben estar abiertos para la extension, para cerrados la modificacion
    class rectangle{
        public double width;
        public double height;
    }
    
    class AreaCalculator{
        public double calculaterectangleArea(rectangle rectangle){
            return rectangle.width * rectangle.height;
        }
    }
    
    //¿Que esta mal? si quieres ofrecer mas formas(circilo, triangulo) tendriamos que modificar AreaCalculator
}