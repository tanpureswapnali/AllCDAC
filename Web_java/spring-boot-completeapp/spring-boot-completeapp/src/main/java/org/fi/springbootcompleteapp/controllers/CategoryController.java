package org.fi.springbootcompleteapp.controllers;

import java.util.List;

import org.fi.springbootcompleteapp.dto.CategoryDTO;
import org.fi.springbootcompleteapp.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")
public class CategoryController 
{
	@Autowired
	CategoryService categoryService;
	
	@GetMapping("/{cid}")
	public CategoryDTO getCategoryById(@PathVariable("cid")int categoryId)
	{
		return categoryService.getCategoryById(categoryId);
	}
	@GetMapping("/all")
	public List<CategoryDTO> allCategories()
	{
		return categoryService.allCategories();
	}
	@PostMapping("/new")
	public boolean newCategory(@RequestBody CategoryDTO dto)
	{
		return categoryService.addNewCategory(dto);
	}
}
