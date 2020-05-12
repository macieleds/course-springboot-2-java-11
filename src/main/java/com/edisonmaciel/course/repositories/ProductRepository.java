package com.edisonmaciel.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edisonmaciel.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
