package com.dio.springboot.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @Value("${app.message}")
    public String appMessage;

    @Value("${ENV_DB_URL: NONE}")
    private String dbEnviromentVariable;

    @GetMapping ("/")
    public String getAppMessage() {
        return appMessage;
    }

    @GetMapping ("/env-variable")
    public String getEnviromentVariable() {
        return "A seguinte Variável de Ambiente foi passada: " + dbEnviromentVariable;
    }
}
