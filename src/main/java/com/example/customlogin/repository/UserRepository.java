package com.example.customlogin.repository;

import com.example.customlogin.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
// przy uzyciu JpaRepository mozemy wykonywac podstawowe operace typu find, save
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByUserName(String userName);
    boolean existsByUserName(String userName);
}