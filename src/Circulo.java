import java.util.Scanner;

public class Circulo {//ej13
    private double radio;
    private double area;
    Scanner sc = new Scanner(System.in);

    public Circulo(double radio){
        this.radio = radio;
    }

    public double getRadio() {
        if (radio < 0){
            radio = 0;
        }
        return radio;
    }

    public double getArea() {
        area = (radio * radio) * Math.PI;
        return area;
    }

    public static class Cilindro extends Circulo{
        private double altura;
        private double volumen;

        public Cilindro(double radio, double altura) {
            super(radio);
            this.altura = altura;
        }

        public double getAltura() {
            if (altura < 0){
                altura = 0;
            }
            return altura;
        }

        public double getVolumen() {
            volumen = super.getArea() * altura;
            return volumen;
        }
    }
    public static void main(String[] args){
        Circulo circ = new Circulo(3);
        Cilindro cil = new Cilindro(3,4);
        System.out.println(circ.getArea());
        System.out.println(cil.getVolumen());
    }
}

