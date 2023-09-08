package org.fi.hibernate.entity;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="product_1234")
public class Products {
	
	@EmbeddedId
	ProductPrimaryKey prodId;
	
	@Column(name="productName")
	 String productName;

	
	@Column(name="productDescription")
	String productDescription;
	
	@Column(name="productPrice")
	float productPrice;
	
	@Column(name="productImageUrl")
	String productImageUrl;

	public Products() {

		// TODO Auto-generated constructor stub
	}

	public Products(ProductPrimaryKey prodId, String productName, String productDescription, float productPrice,
			String productImageUrl) {
		super();
		this.prodId = prodId;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
		this.productImageUrl = productImageUrl;
	}

	public ProductPrimaryKey getProdId() {
		return prodId;
	}

	public void setProdId(ProductPrimaryKey prodId) {
		this.prodId = prodId;
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

	public float getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductImageUrl() {
		return productImageUrl;
	}

	public void setProductImageUrl(String productImageUrl) {
		this.productImageUrl = productImageUrl;
	} 
	
	
	
}
