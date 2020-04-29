package com.example.customlogin.repository;


import com.example.customlogin.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    @Query("from Category_ c where c.user.userName = :userName")
    Optional<Category> findCategoryByUserName(String userName);
}
