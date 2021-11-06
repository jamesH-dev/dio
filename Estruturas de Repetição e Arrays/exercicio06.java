package dio;

/**
 * Crie um vetor de 6 números inteiros e mostre-os na ordem inversa
 */
public class exercicio06 {
    public static void main(String[] args) {

        int[] vet = {0, 1 ,2, 3, 4, 5};
        int i = 0;

        while (i < vet.length){
            System.out.print(vet[i]);
            i++;
        }

        i = 0;
        System.out.print("\nVETOR AO CONTRÁRIO\n");
        for (i = (vet.length - 1); i >= 0; i--){
            System.out.print(vet[i]);
        }
    }
}
