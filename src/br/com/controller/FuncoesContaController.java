package br.com.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class FuncoesContaController {
	
	@GetMapping("/contacorrente")
    public String ContaCorrente(){
        return "Welcome to a Spring Boot REST API";
    }

}
