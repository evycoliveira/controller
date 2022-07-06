package com.itbootcamp.vehicle.dto;

import com.itbootcamp.vehicle.controller.User;

public class UserDto {
    String nome;

    public UserDto(User user) {
        this.nome = user.getNome();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
