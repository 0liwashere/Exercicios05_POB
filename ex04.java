import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][3];
        int[] somaPorLinha = new int[4];

        for (int i = 0; i < 4; i++) {
            int somaLinha = 0;
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                somaLinha += matriz[i][j];
            }
            somaPorLinha[i] = somaLinha;
        }

        System.out.println("Soma de cada linha:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Linha " + i + ": " + somaPorLinha[i]);
        }

        scanner.close();
    }
}
