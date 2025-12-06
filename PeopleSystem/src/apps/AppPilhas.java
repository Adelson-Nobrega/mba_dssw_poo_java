package apps;

import auxiliares.Telefone;
import pessoas.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class AppPilhas {
    static void main() {

        Scanner input = new Scanner(System.in);

        Stack<Funcionario> pilhaAdmissao = new Stack<>();
        Stack<Telefone> pilhaTelefones = new Stack<>();

        IO.println("=== FUNCIONÁRIOS PARA ADMISSÃO ===");
        IO.print("Quantos funcionários deseja cadastrar? ");
        int quantFunc = input.nextInt();
        input.nextLine(); // Limpar o buffer do teclado

        for (int i = 0; i < quantFunc; i++) {
            Funcionario func = new Funcionario();
            IO.print("Informe o nome do Funcionário " + (i + 1) + ": ");
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
                pilhaTelefones.push(telefone);
            }
            pilhaAdmissao.push(func);
        }

        List<Funcionario> funcAdmitidos = new ArrayList<>();
        IO.println("\n=== FUNCIONÁRIOS ADMITIDOS ===");
        while (!pilhaAdmissao.isEmpty()) {
            Funcionario funcAdmitido = pilhaAdmissao.pop();
            IO.println(funcAdmitido.getNome());
            funcAdmitidos.add(funcAdmitido);
        }

        Stack<Telefone> buscaFone = new Stack<>();
        IO.println("\n=== HISTÓRICO DE TELEFONES ===");
        while (!pilhaTelefones.isEmpty()) {
            Telefone telefone = pilhaTelefones.pop();
            IO.println(telefone.getDdd() + " " + telefone.getNumero());
            buscaFone.push(telefone);
        }

        IO.println("\n=== LISTA DE FUNCIONÁRIOS ADMITIDOS ===");
        for (Funcionario funcAdmitido : funcAdmitidos) {
            IO.println(funcAdmitido.getNome());
        }

        while (!buscaFone.isEmpty()) {
            Telefone telefone = buscaFone.pop();
            String foneBusca = telefone.getDdd() + telefone.getNumero();

            for (Funcionario funcAdmitido : funcAdmitidos) {
                List<Telefone> telsContato = funcAdmitido.getTelsContato();
                for (Telefone telContato : telsContato) {
                    String foneCompara = telContato.getDdd() + telContato.getNumero();
                    if (foneCompara.equals(foneBusca)) {
                        IO.println("O telefone " + foneBusca + " pertence ao funcionário " + funcAdmitido.getNome());
                    }
                }
            }
        }

        input.close();
    }
}
