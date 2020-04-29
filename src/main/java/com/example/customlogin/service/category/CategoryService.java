package com.example.customlogin.service.category;

import com.example.customlogin.dto.CategoryDTO;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CategoryService {
    List<CategoryDTO> getCategories (String userName);
    CategoryDTO getCategoryById (long idCategory);
}
