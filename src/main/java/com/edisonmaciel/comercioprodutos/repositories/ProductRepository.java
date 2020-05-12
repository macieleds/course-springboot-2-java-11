package com.edisonmaciel.comercioprodutos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edisonmaciel.comercioprodutos.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
