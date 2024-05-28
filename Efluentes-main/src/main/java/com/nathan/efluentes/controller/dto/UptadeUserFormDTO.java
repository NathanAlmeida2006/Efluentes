package com.nathan.efluentes.controller.dto;

import com.nathan.efluentes.entity.User;

import lombok.Getter;

@Getter
public class UptadeUserFormDTO {

  private long id;
  private String name;
  private String email;
  private String password;

  public UptadeUserFormDTO(User user) {
    id = user.getId();
    name = user.getName();
    email = user.getEmail();
    password = user.getPassword();

  }

}
