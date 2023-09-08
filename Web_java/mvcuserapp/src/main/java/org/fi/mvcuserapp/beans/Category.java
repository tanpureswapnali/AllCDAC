package org.fi.mvcuserapp.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="category_1234")
public class Category {
	
	@Column(name="categoryId")
	String categoryId;
	@Column(name="categoryName")
	String categoryName;
	@Column(name="categoryDescription")
	String categoryDescription;
	@Column(name="categoryImageUrl")
	String categoryImageUrl;
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
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
