package com.senai.efluentes.controller.dto;

import com.senai.efluentes.entity.User;

import lombok.Getter;

/**
 * Representa os dados de atualização de um usuário.
 */
@Getter
public class UptadeUserFormDTO {

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
     * Construtor que recebe um objeto User e extrai os dados relevantes para atualização.
     *
     * @param user Objeto User contendo os dados do usuário.
     */
    public UptadeUserFormDTO(User user) {
        id = user.getId();
        name = user.getName();
        age = user.getAge();
        email = user.getEmail();
        sex = user.getSex();
        cep = user.getCep();
        cpf = user.getCpf();
        address = user.getAddress();
        telephone = user.getTelephone();
        type = user.getType();
        password = user.getPassword();

    }
}
