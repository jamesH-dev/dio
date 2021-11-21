package dio;

import java.util.Scanner;

/**
 * Faça um programa que leia 20 números inteiros (entre 0 e 100) e armazene-os em um vetor
 * Ao final, mostre os números e os seus sucessores.
 */
public class exercicio08 {
    public static void main(String[] args) {
        int numero;
        int[] vetNumeros = new int[20];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < vetNumeros.length; i++){
            System.out.println("Digite um número");
            numero = sc.nextInt();
            while (!(numero >= 0 && numero <= 100)){
                System.out.println("O número deve ser entre 0 e 100!");
                System.out.println("Digite um número");
                numero = sc.nextInt();
            }
            vetNumeros[i] = numero;

        }
        System.out.println("Os sucessores dos números digitados são:");
        for (int numeros : vetNumeros) {
            System.out.println((numeros + 1));

        }
        sc.close();
    }
}
