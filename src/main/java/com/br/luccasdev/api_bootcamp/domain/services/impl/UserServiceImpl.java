package com.br.luccasdev.api_bootcamp.domain.services.impl;

import com.br.luccasdev.api_bootcamp.domain.model.User;
import com.br.luccasdev.api_bootcamp.domain.repository.UserRepository;
import com.br.luccasdev.api_bootcamp.domain.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.NoSuchElementException;
import java.util.Optional;

public class UserServiceImpl implements UserService {

    @Autowired
    private  UserRepository userRepository;


    @Override
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public User create(User userToCreate) {
        if(userToCreate.getId() != null && userRepository.existsById(userToCreate.getId())){
            throw new IllegalArgumentException("This ID already exists");
        }
    }
}
