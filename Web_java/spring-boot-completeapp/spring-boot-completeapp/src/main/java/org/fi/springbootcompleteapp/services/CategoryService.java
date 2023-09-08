package org.fi.springbootcompleteapp.services;

import java.util.List;

import org.fi.springbootcompleteapp.dto.CategoryDTO;

public interface CategoryService {
	boolean addNewCategory(CategoryDTO categoryDTO);
	 List<CategoryDTO> allCategories();
	 CategoryDTO getCategoryById(int categoryId);

}
