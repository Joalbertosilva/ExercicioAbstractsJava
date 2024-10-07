package entities;

public class Account {
    private double saldo;

    public Account(double saldo) {
        this.saldo = saldo;
    }

    public void withdraw(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Erro: Saldo insuficiente para realizar o saque.");
        } else {
            saldo -= valor;
            System.out.println("Saque realizado. Saldo restante: " + saldo);
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
