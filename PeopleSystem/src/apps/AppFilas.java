package apps;

import pessoas.Cliente;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AppFilas {
    static void main() {

        Scanner input = new Scanner(System.in);

        Queue<Cliente> filaLoja = new LinkedList<>();
        IO.println("=== FILA AGUARDANDO ATENDIMENTO ===");
        IO.print("Quantos clientes aguardam atendimento? ");
        int quantCliente = input.nextInt();
        input.nextLine(); // Limpar o buffer do teclado

        for (int i = 0; i < quantCliente; i++) {
            Cliente cliente = new Cliente();
            IO.print("Informe o nome do Cliente " + (i + 1) + ": ");
            cliente.setNome(input.nextLine());
            filaLoja.offer(cliente);
        }

        IO.println("\n=== FILA EM ATENDIMENTO ===");
        while (!filaLoja.isEmpty()) {
            Cliente cliente = filaLoja.poll();
            IO.println(cliente.getNome());
        }
    }
}
