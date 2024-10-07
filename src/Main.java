import entities.*;

public class Main {
    public static void main(String[] args) {
        Account conta = new Account(500.0);  // Saldo inicial

        try {
            conta.withdraw(600.0);  // Tenta sacar um valor maior que o saldo
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());  // Captura a exceção personalizada
        }
    }
}