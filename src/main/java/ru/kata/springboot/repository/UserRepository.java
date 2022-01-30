package ru.kata.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kata.springboot.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
