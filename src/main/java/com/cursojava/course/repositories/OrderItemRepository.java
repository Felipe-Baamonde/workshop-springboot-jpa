package com.cursojava.course.repositories;

import com.cursojava.course.entities.OrderItem;
import com.cursojava.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
