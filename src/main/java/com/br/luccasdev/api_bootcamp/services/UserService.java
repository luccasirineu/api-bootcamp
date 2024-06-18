package com.br.luccasdev.api_bootcamp.services;

import com.br.luccasdev.api_bootcamp.domain.model.User;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface UserService {

    User findById(Long id);

    User create(User userToCreate);


}
