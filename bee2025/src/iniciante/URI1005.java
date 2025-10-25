package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class URI1005 {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        double notaA = leitor.nextDouble();
        double notaB = leitor.nextDouble();

        double pesoA = 3.5;
        double pesoB = 7.5;

        double media = (notaA * pesoA + notaB * pesoB) / (pesoA + pesoB);

        System.out.printf("MEDIA = %.5f\n", media);
    }

}