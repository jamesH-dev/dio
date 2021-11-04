package dio;

import java.util.Scanner;

/**
 * Faça um programa que leia e valide as seguintes informações:
 * Nome: maior que 3 caracteres;
 * Idade: entre 0 e 150;
 * Salário: maior que zero;
 * Sexo: 'f' ou 'm';
 * Estado Civil: 's', 'c', 'v', 'd';
 */
public class exercicio03 {
    public static void main(String[] args) {
        String nome;
        int idade;
        double salario;
        char sexo, estadoCivil;
        Scanner sc =  new Scanner(System.in);

        System.out.println("###################################");
        System.out.println("## FORMULÁRIO DE ADMISSÃO - TQI ###");
        System.out.println("###################################");

        do {
            System.out.println("Nome:");
            nome = sc.nextLine();
            if (nome.length() < 3){
                System.out.println("O campo nome deve conter mais que 3 caracteres, tente novamente!");
            }
        } while (nome.length() < 3);
        do {
            System.out.println("Idade:");
            idade = sc.nextInt();
            if (idade < 0 || idade > 150){
                System.out.println("A idade informada deve ser entre 0 e 150, tente novamente!");
            }
        } while (idade < 0 || idade > 150);
        do {
            System.out.println("Salário: R$");
            salario = sc.nextDouble();
            if (salario <= 0){
                System.out.println("O salário informado deve ser maior que 0, tente novamente!");
            }
        } while (salario <= 0);
        do {
            System.out.println("Sexo (m ou f):");
            sexo = sc.next().charAt(0);
            if (!(sexo == 'm' || sexo == 'f')) {
                System.out.println("As opções disponíveis são F ou M, tente novamente!");
            }
        } while (!(sexo == 'm' || sexo == 'f'));
        do {
            System.out.println("Estado Civil (s, c, v, d): ");
            estadoCivil = sc.next().charAt(0);
            if (!(estadoCivil == 's' || estadoCivil == 'c' || estadoCivil == 'v' || estadoCivil == 'd')) {
                System.out.println("As opções disponíveis são:\n s - Solteiro\n c - Casado\n v - Viúvo\n d - Divorciado\nTente novamente!");
            }
        } while (!(estadoCivil == 's' || estadoCivil == 'c' || estadoCivil == 'v' || estadoCivil == 'd'));

        System.out.println("###################################");
        System.out.println("### RELATÓRIO DA ADMISSÃO - TQI ###");
        System.out.println("## Nome: " + nome + " #############");
        System.out.println("## Idade: " + idade + " ###########");
        System.out.println("## Salário: R$ " + salario + " ####");

        switch (sexo) {
            case 'm' -> System.out.println("## Sexo: Masculino ################");
            case 'f' -> System.out.println("## Sexo: Feminino #################");
        }
        System.out.println("## Estado Civil: " + nome + " #####");



    }
}
