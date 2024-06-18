package com.br.luccasdev.api_bootcamp.domain.services;

import com.br.luccasdev.api_bootcamp.domain.model.User;

import java.util.Optional;

public interface UserService {

    Optional<User> findById(Long id);

    User create(User userToCreate);


}
