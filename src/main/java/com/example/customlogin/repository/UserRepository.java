package com.example.customlogin.repository;

import com.example.customlogin.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
// przy uzyciu JpaRepository mozemy wykonywac podstawowe operace typu find, save
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    Optional<UserEntity> findByUserName(String userName);
    boolean existsByUserName(String userName);
}