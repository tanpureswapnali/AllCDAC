package org.fi.mvc1hiberbootapp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table(name="category_1234")
@NamedQueries({
	@NamedQuery(name="allCategories",query="select OBJECT(oCategory) from Category oCategory")
})
public class Category {
	
	@Id
	@Column(name ="categoryid")
	@GeneratedValue(generator="increment")
	int categoryId;
	
	@Column(name="categoryname")
	String categoryName;
	
	 @Column(name="categorydescription")
	 String categoryDescription;
	 
	 @Column(name="categoryimageurl")
	 String categoryImageUrl;

	public Category() {
		
	}

	public Category(int categoryId, String categoryName, String categoryDescription, String categoryImageUrl) {
		super();
		
		this.categoryName = categoryName;
		this.categoryDescription = categoryDescription;
		this.categoryImageUrl = categoryImageUrl;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryDescription() {
		return categoryDescription;
	}

	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}

	public String getCategoryImageUrl() {
		return categoryImageUrl;
	}

	public void setCategoryImageUrl(String categoryImageUrl) {
		this.categoryImageUrl = categoryImageUrl;
	}
	 
	
	
	

}
