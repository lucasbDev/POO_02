package ex01;

public class Multiplicacao extends OperacaoMatematica {
    public double primeiroValor;
    public double segundoValor;
    public Multiplicacao(double primeiroValor, double segundoValor) {
        this.primeiroValor = primeiroValor;
        this.segundoValor = segundoValor;
    }

    @Override
    public double calcula() {
        return this.primeiroValor * this.segundoValor;
    }
}
