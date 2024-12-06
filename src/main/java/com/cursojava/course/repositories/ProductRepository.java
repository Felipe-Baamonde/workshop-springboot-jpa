package com.cursojava.course.repositories;

import com.cursojava.course.entities.Category;
import com.cursojava.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
