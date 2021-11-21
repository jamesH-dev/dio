package dio;

import java.util.Scanner;

/**
 * Faça um programa que leia um vetor de 6 caracteres, e diga quantas consoantes foram lidas.
 * Imprima as consoantes
 */
public class exercicio07 {
    public static void main(String[] args) {
        String[] consoantes = new String[6];
        Scanner sc = new Scanner(System.in);
        int i, contConsoantes = 0;

        System.out.println("CONTAGEM DE CONSOANTES ");
        for (i=0; i < consoantes.length; i++){
            System.out.println("Digite um caractere:");
            String letra = sc.next();
            if (!(letra.equalsIgnoreCase("a") ||
                letra.equalsIgnoreCase("e") ||
                letra.equalsIgnoreCase("i") ||
                letra.equalsIgnoreCase("o") ||
                letra.equalsIgnoreCase("u"))){

                consoantes[i] = letra;
                contConsoantes++;
            }
        }
        System.out.print("Letras Capturadas:" + i);
        System.out.print("\nConsoantes:" + contConsoantes);

        sc.close();
    }
}
