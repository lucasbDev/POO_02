package ex02;

public class Retangulo implements FormaGeometrica{
    private double comprimento;
    private double largura;

    public Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    @Override
    public double area() {
        return this.comprimento * this.largura;
    }

    @Override
    public double comprimento() {
        return this.comprimento;
    }
}
