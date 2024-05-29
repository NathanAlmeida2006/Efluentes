package com.senai.efluentes.controller.dto.user_dto;

import com.senai.efluentes.entity.User;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Representa os dados de um usuário a serem recebidos no corpo da requisição.
 */
@Getter
@AllArgsConstructor
public class UserFormDTO {

    private long id;
    private String name;
    private int age;
    private String email;
    private char sex;
    private int cep;
    private Integer cpf;
    private String address;
    private Integer telephone;
    private String type;
    private String password;

    /**
     * Converte os dados do formulário em um objeto User.
     *
     * @return Objeto User criado a partir dos dados do formulário.
     */
    public User converter() {
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setAge(age);
        user.setEmail(email);
        user.setSex(sex);
        user.setCep(cep);
        user.setCpf(cpf);
        user.setAddress(address);
        user.setTelephone(telephone);
        user.setType(type);
        user.setPassword(password);
        return user;
    }
}
