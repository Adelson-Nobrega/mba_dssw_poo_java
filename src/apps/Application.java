package apps;

import contas.Conta;
import contas.ContaEspecial;
import contas.ContaInvest;

public class Application {
    static void main() {

        Conta conta01 = new Conta(01, "Adelson");
        ContaEspecial contaEsp01 = new ContaEspecial(02, "Paloma", 10000);
        ContaInvest contaInvest01 = new ContaInvest(03, "Davi", 1, 24);

        System.out.println("--------------------");
        //Impressão via toString
        System.out.println("Conta 01 = " + conta01);
        System.out.println("--------------------");

    }
}
