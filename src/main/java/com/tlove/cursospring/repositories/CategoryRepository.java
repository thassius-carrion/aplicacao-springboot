package com.tlove.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tlove.cursospring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
