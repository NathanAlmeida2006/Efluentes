package com.nathan.efluentes.controller.dto;

import com.nathan.efluentes.entity.User;
import lombok.Getter;

/**
 * Representa os dados de atualização de um usuário.
 */
@Getter
public class UptadeUserFormDTO {

    private long id;
    private String name;
    private String email;
    private String password;

    /**
     * Construtor que recebe um objeto User e extrai os dados relevantes para atualização.
     *
     * @param user Objeto User contendo os dados do usuário.
     */
    public UptadeUserFormDTO(User user) {
        id = user.getId();
        name = user.getName();
        email = user.getEmail();
        password = user.getPassword();
    }
}
