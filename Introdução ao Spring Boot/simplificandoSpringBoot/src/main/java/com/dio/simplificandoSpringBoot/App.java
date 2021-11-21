package com.dio.simplificandoSpringBoot;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);

        Livro livro = factory.getBean(Livro.class);
        livro.setCodigo("0001");
        livro.setNome("Harry Potter");
        Autor autor = factory.getBean(Autor.class);
        autor.setNome("J. K. Rowling");

        livro.exibir();

        factory.close();

    }
}
