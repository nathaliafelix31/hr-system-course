package br.com.felix.userapi.services;

import br.com.felix.userapi.domain.User;

import java.util.List;

public interface UserService {

    User findById(long id);
    List<User> findAll();

}
