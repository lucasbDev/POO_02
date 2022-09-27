package ex01;

public class Divisao extends OperacaoMatematica{
    public double primeiroValor;
    public double segundoValor;

    public Divisao(double primeiroValor, double segundoValor) {
        this.primeiroValor = primeiroValor;
        this.segundoValor = segundoValor;
    }

    @Override
    public double calcula() {
        return this.primeiroValor / this.segundoValor;
    }
}
