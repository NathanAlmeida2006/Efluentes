package com.nathan.efluentes.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nathan.efluentes.controller.dto.UptadeUserFormDTO;
import com.nathan.efluentes.controller.dto.UserDTO;
import com.nathan.efluentes.controller.dto.UserFormDTO;
import com.nathan.efluentes.entity.User;
import com.nathan.efluentes.repository.UserRepository;

import jakarta.transaction.Transactional;

@RestController // Indica que a classe é um controlador REST.
@RequestMapping("/users") // Define o caminho base para as rotas deste controlador.
public class ControllerUser {

  @Autowired // Injeta uma instância do UserRepository.
  private UserRepository userRepository;

  @Transactional // Indica que o método deve ser executado dentro de uma transação.
  @PostMapping // Mapeia requisições POST para este método.
  public UserDTO toSave(@RequestBody UserFormDTO form) { // Recebe os dados do usuário no corpo da requisição e os converte para um objeto User.
    User user = form.converter();
    userRepository.save(user); // Salva o usuário no banco de dados.
    return new UserDTO(user); // Retorna os dados do usuário como resposta.
  }

  @GetMapping // Mapeia requisições GET para este método.
  public List<UserDTO> toList() { // Retorna uma lista de todos os usuários.
    List<User> users = userRepository.findAll();
    return UserDTO.converter(users);
  }

  @Transactional // Indica que o método deve ser executado dentro de uma transação.
  @PutMapping("/{id}") // Mapeia requisições PUT para este método. O ID do usuário é passado como parâmetro na URL.
  public UptadeUserFormDTO toUpdate(@PathVariable Long id) { // Atualiza os dados do usuário com o ID especificado.
    final Optional<User> optUser = userRepository.findById(id);
    if (optUser.isPresent()) {
      User user = optUser.get();
      userRepository.save(user); // Atualiza o usuário no banco de dados.
      return new UptadeUserFormDTO(user); // Retorna os dados atualizados do usuário como resposta.
    }

    System.out.println("User not found!"); // Se o usuário não for encontrado, imprime uma mensagem de erro.
    return null;
  }

  @Transactional // Indica que o método deve ser executado dentro de uma transação.
  @DeleteMapping("/{id}") // Mapeia requisições DELETE para este método. O ID do usuário é passado como parâmetro na URL.
  public void toDelete(@PathVariable Long id) { // Deleta o usuário com o ID especificado.
    final Optional<User> optUser = userRepository.findById(id);

    if (optUser.isPresent()) {
      userRepository.deleteById(id); // Deleta o usuário do banco de dados.
    }

  }

}
