
package Bridge;

//Bridge
//separar una abstraccion de su inolementacion para ambas
//separa una abstraccion de su implementacion para que ambas
//puedan evolucionar independientemente

//ejemplo
//Diferentes formas geometricas que pueden ser dibujadas de distintas maneras (rojo o azul)

public class main {
    //interfaz para la implementacion
    interface Color{
        void applyColor();
    }
    
    //implementacion concreta
    static class Redcolor implements Color {
        public void applyColor(){
            System.out.println("Aplicando color rojo");
        }
    }
    
    static class BlueColor implements Color{
        public void applyColor(){
            System.out.println("Aplicando color azul");
        }
    }
    
    //clase base que sua una implementacion
    static abstract class shape{
        protected Color color;
        
        public shape(Color color) {
            this.color = color;
        }
        
        abstract  void draw();
    }
    
    static class Circle extends shape{
        public Circle(Color color){super(color);}
        
        public void draw(){
            System.out.println("Dibujando circulo");
            color.applyColor();
        }
    }
    
    //uso del patron Bridge
  
        public static void main(String[] args){
            shape redCircle = new Circle(new Redcolor());
            shape blueCircle = new Circle(new BlueColor());
            
            redCircle.draw();
            blueCircle.draw();
        }
    
    
    
}
