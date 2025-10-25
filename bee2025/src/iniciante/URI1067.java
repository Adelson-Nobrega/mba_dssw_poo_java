package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class URI1067 {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int x;

        while (true) {
            x = leitor.nextInt();
            if (x >= 1 && x <= 1000) {
                break;
            } else {
                System.out.println("Valor inválido");
            }
        }

        for (int i = 1; i <= x; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}