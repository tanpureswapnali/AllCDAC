package org.fi.hibernate.entity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
public class ProductPrimaryKey implements Serializable {
	
	private static final long serialVersion = -5210134876593075409L;
	
	@Column(name="categoryId")
	int categoryId;
	
	@Column(name="productId")
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
