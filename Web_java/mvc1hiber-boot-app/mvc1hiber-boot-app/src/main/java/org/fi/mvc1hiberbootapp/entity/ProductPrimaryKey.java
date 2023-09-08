package org.fi.mvc1hiberbootapp.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class ProductPrimaryKey implements Serializable{
	private static final long serialVersionId=5210134876593075409L;
	  @Column(name="categoryid")
	  int categoryId;
	  
      @Column(name="productid")
      int productId;

	public ProductPrimaryKey() {
		
	}

	public ProductPrimaryKey(int categoryId, int productId) {
		super();
		this.categoryId = categoryId;
		this.productId = productId;
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
      
      
}
