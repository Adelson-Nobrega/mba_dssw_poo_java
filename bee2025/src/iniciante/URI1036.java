package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class URI1036 {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double a = leitor.nextDouble();
        double b = leitor.nextDouble();
        double c = leitor.nextDouble();

        double r1, r2;
        double delta = b * b - 4 * a * c;

        if (delta < 0 || a == 0) {
            System.out.println("Impossivel calcular");
        } else {
            r1 = (-b + Math.sqrt(delta)) / (2 * a);
            r2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("R1 = %.5f\n", r1);
            System.out.printf("R2 = %.5f\n", r2);
        }
    }

}
