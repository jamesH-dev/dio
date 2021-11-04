package dio;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;
        do{
            System.out.println("Digite a nota do aluno entre 0 e 10:");
            nota = sc.nextInt();
            if (nota < 0 || nota > 10)
                System.out.println("\nA nota " + nota + " foi digitada incorretamente, por gentileza, tente novamente!");

        } while (nota < 0 || nota > 10);

        System.out.println("Nota correta, obrigado por utilizar nosso programa!");
        sc.close();
    }
}
