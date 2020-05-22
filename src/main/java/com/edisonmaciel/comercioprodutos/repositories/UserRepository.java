package com.edisonmaciel.comercioprodutos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edisonmaciel.comercioprodutos.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{


}
