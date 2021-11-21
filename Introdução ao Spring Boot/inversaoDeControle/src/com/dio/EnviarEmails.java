package com.dio;

public class EnviarEmails {
    public EnviarEmails(String tipo, String endereco, String Senha) {

    }

    public static EnviarEmails obterDadosEmail(){
        return new EnviarEmails("smtp", "contato@email.com", "senha");
    }

    public void retornar(String mensagem){
        System.out.println("Email Enviado!");
    }
}
