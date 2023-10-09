package me.dio.primeiraapipublicada.service;

import me.dio.primeiraapipublicada.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User UserToCreate);
}
