package org.example.account_service.services;

import org.example.account_service.dtos.SignUpRequestDTO;
import org.example.account_service.models.User;
import org.example.account_service.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository repository;
    private BCryptPasswordEncoder passwordEncoder;
    @Autowired
    public UserService(UserRepository userRepository, BCryptPasswordEncoder passwordEncoder) {
        this.repository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public User signUp(SignUpRequestDTO requestDTO) {
        User user = new User();
        user.setName(requestDTO.getName());
        user.setEmail(requestDTO.getEmail());
        user.setHashedPassword(passwordEncoder.encode(requestDTO.getPassword()));
        user.setVerified(false);

        return repository.save(user);
    }
}
