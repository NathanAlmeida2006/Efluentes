package com.nathan.efluentes.controller.dto;

import com.nathan.efluentes.entity.User;
import lombok.Getter;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Representa os dados de um usuário a serem enviados como resposta.
 */
@Getter
public class UserDTO {

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
     * Construtor que recebe um objeto User e extrai os dados relevantes.
     *
     * @param user Objeto User contendo os dados do usuário.
     */
    public UserDTO(User user) {
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

    /**
     * Converte uma lista de objetos User em uma lista de objetos UserDTO.
     *
     * @param users Lista de usuários.
     * @return Lista de UserDTO contendo os dados dos usuários.
     */
    public static List<UserDTO> converter(List<User> users) {
        return users.stream().map(UserDTO::new).collect(Collectors.toList());
    }
}
