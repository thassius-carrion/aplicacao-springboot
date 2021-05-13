package com.tlove.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tlove.cursospring.entities.User;


public interface UserRepository extends JpaRepository<User, Long>{

}
