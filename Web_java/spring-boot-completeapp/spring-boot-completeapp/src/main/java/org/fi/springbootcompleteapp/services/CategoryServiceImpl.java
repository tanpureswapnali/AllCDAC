package org.fi.springbootcompleteapp.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.fi.springbootcompleteapp.dto.CategoryDTO;
import org.fi.springbootcompleteapp.entity.Category;
import org.fi.springbootcompleteapp.repository.CategoryRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryRepository categoryRepository;
	@Override
	public boolean addNewCategory(CategoryDTO categoryDTO) {
		Category  categoryEntity= new Category();
		
		BeanUtils.copyProperties(categoryDTO, categoryEntity);
		categoryRepository.save(categoryEntity);
		return true;
	}

	@Override
	public List<CategoryDTO> allCategories()
	{
		List<Category> list = categoryRepository.findAll();
		ArrayList<CategoryDTO> listDTO = new ArrayList<>();
		for(Category objCategory : list)
		{
			CategoryDTO dto=new CategoryDTO();
			BeanUtils.copyProperties(objCategory, dto);
			   listDTO.add(dto);
		}
		return listDTO;
	}

	@Override
	public CategoryDTO getCategoryById(int categoryId) {
		Optional<Category> optCategory = categoryRepository.findById(categoryId);
		     if(optCategory.isPresent())
		{
			CategoryDTO dto = new CategoryDTO();
			BeanUtils.copyProperties(optCategory.get(),dto);
			return dto;
		}
		
		return null;
	}

}
