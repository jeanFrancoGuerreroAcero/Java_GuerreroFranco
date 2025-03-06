
package SOLID_OCP;

abstract class Shape{
    abstract double calculateArea();
}

public class Good {
    static class Rectangle extends Shape{
        
        double widht, height;
        public Rectangle(double widht, double height){
            this.widht = widht;
            this.height = height;
        }
        
        @Override
        double calculateArea(){
            return widht*height;
        }
        
    }
    static class Circle extends Shape{
        double radius;
        public Circle(double radius){
            this.radius = radius;
            
        }
        
        @Override
        double calculateArea(){
            return Math.PI * radius*radius;
        }
        
    }
    static class AreaCalculator{
        public static double calculateArea(Shape shape){
            return shape.calculateArea();
            
        }
    }
    public static void main(String [] args){
        Shape rectangulo = new Rectangle(10, 12);
        Shape circulo = new Circle(7);
        System.out.println("Area del rectangulo" + AreaCalculator.calculateArea(rectangulo));
        System.out.println("Area del circulo" + AreaCalculator.calculateArea(circulo));
    }
}
