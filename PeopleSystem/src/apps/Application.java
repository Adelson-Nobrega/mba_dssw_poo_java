package apps;

import auxiliares.*;
import pessoas.Pessoa;

public class Application {
    static void main() {
        Pessoa pessoa1 = new Pessoa();

        pessoa1.setNome("João da Silva");

        Telefone tel1 = new Telefone("83", "99999-9999");
        pessoa1.setTelsContato(tel1);

        Endereco endereco1 = new Endereco("Rua das Flores", "123", "Ap 101", "Centro", "São Paulo", "SP", "11252-000");
        pessoa1.setEndereco(endereco1);
    }
}
