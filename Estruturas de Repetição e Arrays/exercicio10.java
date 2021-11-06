package dio;

import java.util.Random;

/**
 * Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0~9
 */
public class exercicio10 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matriz = new int[100][100];

        for (int linhas = 0; linhas < matriz.length; linhas++){
            for (int colunas = 0; colunas < matriz.length; colunas++){
                matriz[linhas][colunas] = random.nextInt(9);
            }
        }

        for ( int[] vetorLinha : matriz) {
            for ( int vetorColuna : vetorLinha ) {
                System.out.print(vetorColuna + " ");
            }
            System.out.println();
        }

    }
}
