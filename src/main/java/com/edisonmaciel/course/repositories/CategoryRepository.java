package com.edisonmaciel.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edisonmaciel.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
