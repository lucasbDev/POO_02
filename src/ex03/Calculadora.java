package ex03;


import java.util.Scanner;

public class Calculadora {
    private OperacaoMatematica operacao;
    private int a;
    private int b;

    public Calculadora(OperacaoMatematica operacao, int a, int b) {
        this.operacao = operacao;
        this.a = a;
        this.b = b;
    }

    public void calular(){
        System.out.println("O resultado é: " + operacao.calcula(this.a,this.b) );
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        OperacaoMatematica soma = new Soma();
        OperacaoMatematica subtracao = new Subtracao();
        OperacaoMatematica multiplicacao = new Multiplicacao();
        OperacaoMatematica divisao = new Divisao();

        int opcaoEscolhida = -1;
        while (opcaoEscolhida != 0) {
            System.out.println("-------Calculadora-------");
            System.out.println("digite o primeiro valor: ");
            int a = input.nextInt();
            System.out.println("digite o segundo valor: ");
            int b = input.nextInt();
            System.out.println("Digite a opção desejada: ");
            System.out.println("Para Somar digite [1]");
            System.out.println("Para Subtrair digite [2]");
            System.out.println("Para Multiplicar digite [3]");
            System.out.println("Para Dividir digite [4]");
            System.out.println("Para encerrar a Calculadora digite [0]");
            opcaoEscolhida = input.nextInt();

            if(opcaoEscolhida == 1){
                Calculadora calculadora = new Calculadora(soma, a, b);
                calculadora.calular();
            }else if (opcaoEscolhida == 2){
                Calculadora calculadora = new Calculadora(subtracao, a, b);
                calculadora.calular();
            }else if(opcaoEscolhida == 3){
                Calculadora calculadora = new Calculadora(multiplicacao, a, b);
                calculadora.calular();
            }else if (opcaoEscolhida == 4){
                Calculadora calculadora = new Calculadora(divisao, a, b);
                calculadora.calular();
            }
        }
    }
}
