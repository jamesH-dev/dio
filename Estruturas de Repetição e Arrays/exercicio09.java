package dio;

import java.util.Random;
import java.util.Scanner;

/**
 * Faça o mesmo programa do exercício passado, porém agora com números aleatórios, sem entrada do usuário.
 */
public class exercicio09 {
    public static void main(String[] args) {
        int numero;
        int[] vetNumeros = new int[20];
        Random random = new Random();

        for (int i = 0; i < vetNumeros.length; i++){
            numero = random.nextInt(100);
            vetNumeros[i] = numero;

        }
        System.out.println("Os sucessores dos números aleatórios escolhidos pelo sistema são:");
        for (int numeros : vetNumeros) {
            System.out.print((numeros + 1) + ", ");

        }
    }
}
