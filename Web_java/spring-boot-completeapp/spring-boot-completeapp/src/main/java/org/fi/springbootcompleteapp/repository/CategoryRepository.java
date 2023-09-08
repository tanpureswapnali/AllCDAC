package org.fi.springbootcompleteapp.repository;

import org.fi.springbootcompleteapp.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
