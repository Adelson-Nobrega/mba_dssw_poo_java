package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class URI1037 {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double v = leitor.nextDouble();

        double ix1 = 0;
        double ix2 = 25;
        double ix3 = 50;
        double ix4 = 75;
        double ix5 = 100;

        if (v >= 0 && v <= 25) {
            System.out.printf("Intervalo [%.0f,%.0f]\n", ix1, ix2);
        } else if (v > 25 && v <= 50) {
            System.out.printf("Intervalo (%.0f,%.0f]\n", ix2, ix3);
        } else if (v > 50 && v <= 75) {
            System.out.printf("Intervalo (%.0f,%.0f]\n", ix3, ix4);
        } else if (v > 75 && v <= 100) {
            System.out.printf("Intervalo (%.0f,%.0f]\n", ix4, ix5);
        } else {
            System.out.println("Fora de intervalo");
        }

    }

}