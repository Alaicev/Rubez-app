package ru.altarev123456.Rubez.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.altarev123456.Rubez.entity.User;
import ru.altarev123456.Rubez.repository.UserRepository;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void createUser(User user) {
        userRepository.save(user);
    }

    public List<User> getAllUsers () {
        return userRepository.findAll();
    }
}
