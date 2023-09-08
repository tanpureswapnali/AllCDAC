package org.fi.hiberbootapp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="product_1234")
public class Product {


	@Id
	@Column(name="categoryid")
	@GeneratedValue(generator="increment")
	int categoryId;
	
	@Column(name="productid")
	int productId;
	

	@Column(name="productname")
	String productName;
	
	@Column(name="productdescription")
	String productDescription;
	
	@Column(name="productimageurl")
	String productImageUrl;

	public Product() {
		
	}

	public Product(int productId, String productName, String productDescription,
			String productImageUrl) {
		super();
		
		this.productId = productId;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productImageUrl = productImageUrl;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductImageUrl() {
		return productImageUrl;
	}

	public void setProductImageUrl(String productImageUrl) {
		this.productImageUrl = productImageUrl;
	}
	
	
	
	
}
