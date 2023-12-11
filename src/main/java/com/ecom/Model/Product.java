package com.ecom.Model;

import com.ecom.enums.ProductCategory;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product 
{
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer productId;
	    private String productName;
	    private Integer productPrice;
	    private String productDesc;
	    
	    @Enumerated(value = EnumType.STRING) // is used to specify the mapping of an enum type.
	    private ProductCategory productCategory;
	    private String productBrand;
	    
		public Product(Integer productId, String productName, Integer productPrice, String productDesc,
				ProductCategory productCategory, String productBrand) {
			super();
			this.productId = productId;
			this.productName = productName;
			this.productPrice = productPrice;
			this.productDesc = productDesc;
			this.productCategory = productCategory;
			this.productBrand = productBrand;
		}

		public Integer getProductId() {
			return productId;
		}

		public void setProductId(Integer productId) {
			this.productId = productId;
		}

		public String getProductName() {
			return productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public Integer getProductPrice() {
			return productPrice;
		}

		public void setProductPrice(Integer productPrice) {
			this.productPrice = productPrice;
		}

		public String getProductDesc() {
			return productDesc;
		}

		public void setProductDesc(String productDesc) {
			this.productDesc = productDesc;
		}

		public ProductCategory getProductCategory() {
			return productCategory;
		}

		public void setProductCategory(ProductCategory productCategory) {
			this.productCategory = productCategory;
		}

		public String getProductBrand() {
			return productBrand;
		}

		public void setProductBrand(String productBrand) {
			this.productBrand = productBrand;
		}

		public Product() {
			super();
			// TODO Auto-generated constructor stub
		}
}
