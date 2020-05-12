package com.edisonmaciel.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edisonmaciel.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
