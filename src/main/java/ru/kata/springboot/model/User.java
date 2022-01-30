package ru.kata.springboot.model;

import lombok.*;

import javax.persistence.*;

@ToString
@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "users")
public class User {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String firstName;
   private String lastName;
   private String email;
}
