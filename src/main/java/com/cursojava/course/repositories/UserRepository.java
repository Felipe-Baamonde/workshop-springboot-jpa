package com.cursojava.course.repositories;

import com.cursojava.course.entities.Order;
import com.cursojava.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
}
