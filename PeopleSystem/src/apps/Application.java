package apps;

import auxiliares.Telefone;
import auxiliares.Endereco;
import pessoas.*;

import java.time.LocalDate;

public class Application {
    static void main() {

        Funcionario func1 = new Funcionario();
        func1.setNome("João da Silva");
        func1.setDataNascimento(LocalDate.of(1985, 5, 20));
        Telefone residencial = new Telefone("11", "78888-7777");
        Telefone celular = new Telefone("21", "88888-7777");
        Telefone empresarial = new Telefone("31", "98888-7777");

        IO.println("lista de Telefones Vazio: " + func1.getTelsContato());

        func1.adicionarTelefone(residencial);
        System.out.println("lista de Telefones " + func1.getTelsContato());
        func1.adicionarTelefone(celular);
        System.out.println("lista de Telefones " + func1.getTelsContato());
        func1.adicionarTelefone(empresarial);
        System.out.println("lista de Telefones " + func1.getTelsContato());

        func1.getTelsContato().remove(residencial);

        IO.println("lista de Telefones " + func1.getTelsContato());
    }
}
