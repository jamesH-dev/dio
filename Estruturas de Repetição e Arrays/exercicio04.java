package dio;

/**
 * Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de crescimento de 3% e
 * que a população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%.
 * Faça um programa que calcule e escreva o número de anos necessários para que a população do país A
 * ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento.
 */
public class exercicio04 {
    public static void main(String[] args) {
        int populacaoA = 80000, populacaoB = 200000, contador = 0;
        double txCrescimentoA = 0.03, txCrescimentoB = 0.015, crescimentoA = 0, crescimentoB = 0;

        while (populacaoB > populacaoA){
            crescimentoA = populacaoA * txCrescimentoA;
            crescimentoB = populacaoB * txCrescimentoB;

            contador++;
            populacaoA += crescimentoA;
            populacaoB += crescimentoB;

        }
        System.out.println("Serão necessários " + contador + " anos para a Cidade A passar a Cidade B");
    }
}
