package com.edisonmaciel.comercioprodutos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edisonmaciel.comercioprodutos.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
