package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class URI1070 {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int x = leitor.nextInt();

        int cont = 1;
        while (cont <= 6) {
            if (x % 2 != 0) {
                System.out.println(x);
                cont++;
            }
            x++;
        }
    }
}