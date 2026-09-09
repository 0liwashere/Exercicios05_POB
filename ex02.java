import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] matriz = new double[4][4];
        double somaDiagonal = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite o valor da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextDouble();

                if (i == j) {
                    somaDiagonal += matriz[i][j];
                }
            }
        }

        System.out.println("Soma da diagonal principal: " + somaDiagonal);

        scanner.close();
    }
}
