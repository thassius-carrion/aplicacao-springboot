package com.tlove.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tlove.cursospring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
