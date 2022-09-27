package ex01;

public class Soma extends OperacaoMatematica {
        public double primeiroValor;
        public double segundoValor;

        public Soma(double primeiroValor, double segundoValor){
            this.primeiroValor = primeiroValor;
            this.segundoValor = segundoValor;
        }

    @Override
    public double calcula() {
        return primeiroValor + segundoValor;
    }
}
