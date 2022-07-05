package com.itbootcamp.vehicle.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Indica que a classe é um controller Rest
@RequestMapping("/users") // Indica que "/user" é usado para acionar esse controller
public class Hello {

    @GetMapping // Método acionado por uma requisição GET
    public String digaHello() {
        return "Olá";
    }
}
