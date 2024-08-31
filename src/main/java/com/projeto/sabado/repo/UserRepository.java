package com.projeto.sabado.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.sabado.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
