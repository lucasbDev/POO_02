package ex02;

public class Quadrado implements FormaGeometrica {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return this.lado * this.lado;
    }

    @Override
    public double comprimento() {
        return  this.lado;
    }

}
