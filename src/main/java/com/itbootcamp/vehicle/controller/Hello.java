package com.itbootcamp.vehicle.controller;

import org.springframework.web.bind.annotation.*;

@RestController // Indica que a classe é um controller Rest
@RequestMapping("/user") // Indica que "/user" é usado para acionar esse controller
public class Hello {

    @GetMapping ("/ola/{nome}/{id}")// Método acionado por uma requisição GET
    public String digaHello(@PathVariable String nome, @PathVariable int id) {
        return "Olá " + nome + ":" + id + " !";
    }

    @GetMapping ("/ola")// Método acionado por uma requisição GET
    public String digaHelloII(@RequestParam String nome, @RequestParam int id) {
        return "Olá " + nome + " !";
    }
}
