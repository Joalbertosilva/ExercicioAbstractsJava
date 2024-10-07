package entities;

import java.util.Scanner;

public class Calculadora {
    private double resultado;

    public Calculadora(double numeroInicial) {
        this.resultado = numeroInicial;
    }

    public void operations() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Resultado atual: " + resultado);
            System.out.println("Escolha a operação: ");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Sair");

            int opcao = scanner.nextInt();

            if (opcao == 5) {
                System.out.println("Finalizando a calculadora...");
                break;
            }

            System.out.println("Insira o próximo número: ");
            double numero = scanner.nextDouble();

            switch (opcao) {
                case 1:
                    resultado += numero;
                    break;
                case 2:
                    resultado -= numero;
                    break;
                case 3:
                    resultado *= numero;
                    break;
                case 4:
                    try {
                        if (numero == 0) {
                            throw new ArithmeticException("Erro: Não é possível dividir por zero.");
                        }
                        resultado /= numero;
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        System.out.println("Resultado final: " + resultado);
        scanner.close();
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}
