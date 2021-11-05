package dio;

import java.util.Scanner;

/**
 * Altere o programa anterior permitindo ao usuário informar as populações e as taxas de crescimento iniciais.
 * Valide a entrada e permita repetir a operação.
 */
public class exercicio05 {
    public static void main(String[] args) {
        char op = 0;
        int populacaoA, populacaoB, contador = 0;
        double txCrescimentoA, txCrescimentoB, crescimentoA = 0, crescimentoB = 0;
        String nomeCidadeA, nomeCidadeB;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\nCalculadora de Crescimento Anual");
            System.out.println("Para começarmos, digite o nome da primeira cidade:");
            nomeCidadeA = sc.nextLine();
            System.out.println("Excelente, agora digite a população de " + nomeCidadeA + ":");
            populacaoA = sc.nextInt();
            System.out.println("Agora digite a taxa de crescimento de " + nomeCidadeA + ":");
            txCrescimentoA = sc.nextDouble();

            System.out.println("\nExcelente! Agora informe os dados da segunda cidade, vamos começar pelo nome:");
            sc.nextLine();
            nomeCidadeB = sc.nextLine();
            System.out.println("Excelente, agora digite a população de " + nomeCidadeB + ":");
            populacaoB = sc.nextInt();
            System.out.println("Agora digite a taxa de crescimento de " + nomeCidadeB + ":");
            txCrescimentoB = sc.nextDouble();

            if (populacaoB > populacaoA) {
                while (populacaoB > populacaoA) {
                    crescimentoA = populacaoA * txCrescimentoA;
                    crescimentoB = populacaoB * txCrescimentoB;

                    contador++;
                    populacaoA += crescimentoA;
                    populacaoB += crescimentoB;
                }
                System.out.println("Serão necessários " + contador + " anos para "+ nomeCidadeA + " ultrapassar " + nomeCidadeB);

            }
            else {
                while (populacaoA > populacaoB) {
                    crescimentoA = populacaoA * txCrescimentoA;
                    crescimentoB = populacaoB * txCrescimentoB;

                    contador++;
                    populacaoA += crescimentoA;
                    populacaoB += crescimentoB;
                }
                System.out.println("Serão necessários " + contador + " anos para "+ nomeCidadeB + " ultrapassar " + nomeCidadeA);

            }

            System.out.println("\nDeseja reiniciar o programa? (s/n)");
            sc.nextLine();
            op = sc.nextLine().charAt(0);
        } while (op == 's');

    }
}
