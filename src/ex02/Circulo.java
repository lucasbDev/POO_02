package ex02;

public class Circulo implements FormaGeometrica{
    private final double pi = 3.14;
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return this.pi * (this.raio * this.raio);
    }

    @Override
    public double comprimento() {
        return 2 * this.pi * this.raio;
    }
}
