package com.edisonmaciel.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edisonmaciel.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
