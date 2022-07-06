package com.itbootcamp.vehicle.controller;

import com.itbootcamp.vehicle.dto.UserDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController // Indica que a classe é um controller Rest
@RequestMapping("/user") // Indica que "/user" é usado para acionar esse controller
public class Requests {

    @GetMapping ("/ola/{nome}/{id}")// Método acionado por uma requisição GET
    public String digaHello(@PathVariable String nome, @PathVariable int id) {
        return "Olá " + nome + ":" + id + " !";
    }

    @GetMapping ("/ola")// Método acionado por uma requisição GET
    public String digaHelloII(@RequestParam String nome, @RequestParam int id) {
        return "Olá " + nome + " !";
    }

    @PostMapping
    public ResponseEntity<User> getUser (@RequestBody User user) {
        if(user.getId() == 123) {
            UserDto userDto = new UserDto(user);
            return new ResponseEntity(userDto, HttpStatus.OK);
        }
        return new ResponseEntity(null, HttpStatus.BAD_REQUEST);
    }
}
