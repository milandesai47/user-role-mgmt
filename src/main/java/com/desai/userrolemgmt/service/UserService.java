package com.desai.userrolemgmt.service;


import com.desai.userrolemgmt.model.Users;
import com.desai.userrolemgmt.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository repository) {
        this.userRepository = repository;
    }

    public List<Users> getAllUsers() {
       return userRepository.findAll();
    }

    public Users getUserByUserId(String userId) {
        return userRepository.findByUserId(userId).get();
    }

    public Users getUserByEmail(String email) {
        return userRepository.findByEmail(email).get();
    }
}
