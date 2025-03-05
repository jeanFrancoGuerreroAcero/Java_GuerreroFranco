
package SOLID_LSP;

public class main {
    public double calcularArea(){
        double area = 0.0;
        return area;
    }
    
    class Rectangulo extends main{
        private double ancho;
        private double alto;

        public Rectangulo(double ancho, double alto){
            this.ancho = ancho;
            this.alto = alto;
        }

        public double getAncho() {
            return ancho;
        }

        public double getAlto() {
            return alto;
        }

        public void setAncho(double ancho) {
            this.ancho = ancho;
        }

        public void setAlto(double alto) {
            this.alto = alto;
        }

        @Override
        public double calcularArea(){
            return ancho * alto;
        }
    }
}
