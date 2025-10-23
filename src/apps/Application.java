package apps;

import contas.Conta;
import contas.ContaEspecial;
import contas.ContaInvest;

public class Application {
    static void main() {

        Conta conta01 = new Conta(01, "Adelson");
        ContaEspecial contaEsp01 = new ContaEspecial(02, "Paloma", 10000);
        ContaInvest contaInvest01 = new ContaInvest(03, "Davi", 1, 24);

        if (conta01.depositar(2000)) {
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Valor inválido!");
        }

        if (contaEsp01.depositar(1500)) {
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Valor inválido!");
        }

        if (contaInvest01.depositar(500)) {
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Valor inválido!");
        }

        System.out.println(conta01);
        System.out.println(contaEsp01);
        System.out.println(contaInvest01);

        contaInvest01.aplicarRendimento();
        contaEsp01.sacar(2000);

        System.out.println("Saldo da conta especial " + contaEsp01.numero + ": R$ " + contaEsp01.getSaldo());
        System.out.println("Limite da conta especial " + contaEsp01.numero + ": R$ " + contaEsp01.getLimite());
    }
}
