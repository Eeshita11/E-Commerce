package com.ecom.Model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Orders 
{
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer orderId;


	    @ManyToOne()
	    @JoinColumn(name = "fk_user_id")
	    private User user;

	    @ManyToMany()
	    @JoinTable(name = "fk_order_product_table",joinColumns = @JoinColumn(name = "fk_order_id"),
	            inverseJoinColumns = @JoinColumn(name = "fk_product_id"))
	    private List<Product> products;

	    @OneToOne()
	    @JoinColumn(name = "fk_address_id")
	    private Address address;
	    private Integer productQuantity;
	    
		public Orders(Integer orderId, User user, List<Product> products, Address address, Integer productQuantity) {
			super();
			this.orderId = orderId;
			this.user = user;
			this.products = products;
			this.address = address;
			this.productQuantity = productQuantity;
		}

		public Integer getOrderId() {
			return orderId;
		}

		public void setOrderId(Integer orderId) {
			this.orderId = orderId;
		}

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}

		public List<Product> getProducts() {
			return products;
		}

		public void setProducts(List<Product> products) {
			this.products = products;
		}

		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
		}

		public Integer getProductQuantity() {
			return productQuantity;
		}

		public void setProductQuantity(Integer productQuantity) {
			this.productQuantity = productQuantity;
		}

		public Orders() {
			super();
			// TODO Auto-generated constructor stub
		}
		
}
