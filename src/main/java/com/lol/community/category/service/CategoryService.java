package com.lol.community.category.service;

import com.lol.community.category.domain.Category;
import com.lol.community.category.dto.response.CategoryResponse;
import com.lol.community.category.repository.CategoryRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public List<CategoryResponse> findCategoriesByBoardType(String boardType) {
        List<Category> categories = categoryRepository.findChildrenByParentCategoryName(boardType);
        return categories.stream()
                .map(Category::toResponse)
                .toList();
    }
}
