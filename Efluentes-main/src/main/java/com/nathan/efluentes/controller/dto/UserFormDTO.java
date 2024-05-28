package com.nathan.efluentes.controller.dto;

import com.nathan.efluentes.entity.User;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UserFormDTO {

  private long id;
  private String name;
  private String email;
  private String password;

  public User converter() {
    User user = new User();
    user.setId(id);
    user.setName(name);
    user.setEmail(email);
    user.setPassword(password);
    return user;

  }

}
