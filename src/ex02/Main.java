package ex02;

public class Main {

    public static void main(String[] args) {
        FormaGeometrica testUm = new Circulo(4);
        FormaGeometrica testeDois = new Quadrado(20.5);

        System.out.println("a área do circulo é: " + testUm.area());
        System.out.println("o comprimento do circulo é: " + testUm.comprimento());

        System.out.println("a área do quadrado é: " + testeDois.area());
        System.out.println("o comprimento do quadrado é: " + testeDois.comprimento());
    }
}
