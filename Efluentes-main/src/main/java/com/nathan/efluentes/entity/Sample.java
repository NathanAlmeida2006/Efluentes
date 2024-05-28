package com.nathan.efluentes.entity;

import java.sql.Date;

import jakarta.persistence.Entity; 
import jakarta.persistence.Id; 
import lombok.*; 

@Entity // Anotação que indica que esta classe é uma entidade JPA.
@Getter // Anotação do Lombok que gera automaticamente os métodos getter para todos os campos da classe.
@Setter // Anotação do Lombok que gera automaticamente os métodos setter para todos os campos da classe.
@ToString // Anotação do Lombok que gera automaticamente o método toString para a classe.
@NoArgsConstructor // Anotação do Lombok que gera automaticamente um construtor sem argumentos.
@AllArgsConstructor // Anotação do Lombok que gera automaticamente um construtor com argumentos para todos os campos da classe.
@EqualsAndHashCode // Anotação do Lombok gera os métodos equals(), hashCode() e também um método canEqual() para verificar se o objeto comparado é uma instância da mesma classe.
public class Sample { // Declaração da classe User.

  @Id // Anotação que indica que o campo 'id' é a chave primária da entidade.
  private long id; 

  @NonNull // Notação para variável não nula
  private String name; 

  @NonNull
  private String type;

  @NonNull
  private Date collectionDate;

  @NonNull
  private String local;

  @NonNull
  private String chemicalParameters;

  @NonNull
  private Boolean status;

} 