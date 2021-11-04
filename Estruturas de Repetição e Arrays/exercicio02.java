package dio;

import java.util.Objects;
import java.util.Scanner;

/**
 * Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário,
 * mostrando uma mensagem de erro e voltando a pedir as informações
 */
public class exercicio02 {
    public static void main(String[] args) {
        String user, password;
        Scanner sc = new Scanner(System.in);
        boolean verification;

        do {
            System.out.println("\nUser:");
            user = sc.next();
            System.out.println("\nPassword:");
            password = sc.next();

            if(Objects.equals(user, password)) {
                System.out.println("Sua senha é igual ao usuário, por favor, tente novamente!");
                verification = false;
            }
            else{
                System.out.println("Usuário " + user + " criado com sucesso!");
                verification = true;
            }

        }while (!verification);
        sc.close();
    }
}
