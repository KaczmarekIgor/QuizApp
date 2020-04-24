package com.example.customlogin.service;


import com.example.customlogin.entity.UserEntity;
import com.example.customlogin.exception.UserExistsException;
import com.example.customlogin.form.UserRegisterForm;
import com.example.customlogin.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;



@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void createUser(UserRegisterForm userRegisterForm) {
        if (userRepository
                .existsByUserName(userRegisterForm.getUserName())) {
            throw new UserExistsException(userRegisterForm.getUserName());
        }
        UserEntity user = new UserEntity(userRegisterForm.getLogin(),
                passwordEncoder.encode(userRegisterForm.getPassword()),
                userRegisterForm.getUserName());
        userRepository.save(user);
    }
}


