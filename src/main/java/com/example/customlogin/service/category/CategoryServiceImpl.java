package com.example.customlogin.service.category;

import com.example.customlogin.dto.CategoryDTO;
import com.example.customlogin.exception.NotFoundQuizExcpetion;
import com.example.customlogin.mapper.ModelMapper;
import com.example.customlogin.repository.CategoryRepository;
import com.example.customlogin.repository.QuizRepository;
import com.example.customlogin.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImpl implements CategoryService {

    final UserRepository userRepository;
    final CategoryRepository categoryRepository;
    final QuizRepository quizRepository;

    public CategoryServiceImpl(UserRepository userRepository, CategoryRepository categoryRepository, QuizRepository quizRepository) {
        this.userRepository = userRepository;
        this.categoryRepository = categoryRepository;
        this.quizRepository = quizRepository;
    }

    @Override
    public List<CategoryDTO> getCategories(String userName) {
        return categoryRepository
                .findCategoryByUserName(userName)
                .stream()
                .map(ModelMapper::map)
                .collect(Collectors.toList());
    }

    @Override
    public CategoryDTO getCategoryById(long idCategory) {
        return categoryRepository.findById(idCategory)
                .map(ModelMapper::map)
                .orElseThrow(() -> new NotFoundQuizExcpetion("xxxxx"));
    }
}
