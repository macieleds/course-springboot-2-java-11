package com.edisonmaciel.comercioprodutos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edisonmaciel.comercioprodutos.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
