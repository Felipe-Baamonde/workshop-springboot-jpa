package com.cursojava.course.services;

import com.cursojava.course.entities.User;
import com.cursojava.course.exceptions.DatabaseException;
import com.cursojava.course.exceptions.ResourceNotFoundException;
import com.cursojava.course.repositories.OrderRepository;
import com.cursojava.course.repositories.UserRepository;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Usuário de id: %d não encontrado".formatted(id)));
    }

    public User insert(User obj) {
        return userRepository.save(obj);
    }

    public void delete(Long id) {
        if (userRepository.existsById(id)) {
            if(orderRepository.findAllByClientId(id).size() > 0) {
                throw new DatabaseException("Usuário possui pedidos associados");
            }
            userRepository.deleteById(id);
        }else{
            throw new ResourceNotFoundException("Usuário de id: %d não encontrado".formatted(id));
        }

    }

    public User update(Long id, User obj) {
        User entity = userRepository.getReferenceById(id);
        updateData(entity, obj);
        return userRepository.save(entity);
    }
    private void updateData(User entity, User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }
}
