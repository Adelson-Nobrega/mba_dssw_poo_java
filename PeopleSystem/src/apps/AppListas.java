package apps;

import auxiliares.Telefone;
import pessoas.Cliente;
import pessoas.Funcionario;

import java.util.*;

public class AppListas {
    static void main() {

        Scanner input = new Scanner(System.in);

        IO.println("\n=== CADASTRO DE FUNCIONÁRIOS (LISTA) ===");
        List<Funcionario> funcionarios = new ArrayList<>();
        IO.print("Quantos funcionários deseja cadastrar? ");
        int quantFunc = input.nextInt();
        input.nextLine(); // Limpar o buffer do teclado

        for (int i = 0; i < quantFunc; i++) {
            Funcionario func = new Funcionario();

            IO.print("Nome do Funcionário " + (i + 1) + ": ");
            func.setNome(input.nextLine());

            IO.print("Quantos telefones deseja cadastrar? ");
            int quantTel = input.nextInt();
            input.nextLine(); // Limpar o buffer do teclado

            for (int j = 0; j < quantTel; j++) {
                IO.print("Informe o DDD: ");
                String ddd = input.nextLine();

                IO.print("Informe o número: ");
                String numero = input.nextLine();

                Telefone telefone = new Telefone(ddd, numero);
                func.adicionarTelefone(telefone);
            }

            funcionarios.add(func);
        }

        IO.println("\n=== LISTA DE FUNCIONÁRIOS ===");
        for (Funcionario func : funcionarios) {
            IO.println("Funcionário: " + func.getNome());
            IO.println("Telefones: " + func.getTelsContato());
        }

        IO.println("\n=== CADASTRO DE CLIENTES (LISTA) ===");
        List<Cliente> clientes = new ArrayList<>();
        IO.print("Quantos clientes deseja cadastrar? ");
        int quantCliente = input.nextInt();
        input.nextLine(); // Limpar o buffer do teclado

        for (int i = 0; i < quantCliente; i++) {
            Cliente cliente = new Cliente();

            IO.print("Nome do Cliente " + (i + 1) + ": ");
            cliente.setNome(input.nextLine());

            IO.print("Quantos telefones deseja cadastrar? ");
            int quantTel = input.nextInt();
            input.nextLine(); // Limpar o buffer do teclado

            for (int j = 0; j < quantTel; j++) {
                IO.print("Informe o DDD: ");
                String ddd = input.nextLine();

                IO.print("Informe o número: ");
                String numero = input.nextLine();

                Telefone telefone = new Telefone(ddd, numero);
                cliente.adicionarTelefone(telefone);
            }

            clientes.add(cliente);
        }

        IO.println("\n=== LISTA DE CLIENTES ===");
        for (Cliente cliente : clientes) {
            IO.println("Cliente: " + cliente.getNome());
            IO.println("Telefones: " + cliente.getTelsContato());
        }

        Collections.sort(clientes, new Comparator<Cliente>() {
            @Override
            public int compare(Cliente c1, Cliente c2) {
                return c1.getNome().compareTo(c2.getNome());
            }
        });

        input.close();
    }
}
