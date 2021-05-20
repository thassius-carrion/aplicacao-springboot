package com.tlove.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tlove.cursospring.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
