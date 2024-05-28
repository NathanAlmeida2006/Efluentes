package com.nathan.efluentes.controller.dto;

import lombok.Getter;
import java.util.List;

import java.util.stream.Collectors;

import com.nathan.efluentes.entity.User;

@Getter
public class UserDTO {

  private long id;
  private String name;
  private String email;
  private String password;

  public UserDTO(User user) {
    id = user.getId();
    name = user.getName();
    email = user.getEmail();
    password = user.getPassword();

  }

  public static List<UserDTO> converter(List<User> users) {
    return users.stream().map(UserDTO::new).collect(Collectors.toList());

  }

}
