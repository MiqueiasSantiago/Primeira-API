package com.primeiro_projeto.service;

import com.primeiro_projeto.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
