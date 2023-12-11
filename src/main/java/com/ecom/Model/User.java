package com.ecom.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class User 
{
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer userId;
	    private String userName;
	    private String UserEmail;

	    private String userPassword;

	    private String userPhoneNo;

	    @OneToOne
	    @JoinColumn(name = "fk_Address_Id")
	    private Address address;

		public User(Integer userId, String userName, String userEmail, String userPassword, String userPhoneNo,
				Address address) {
			super();
			this.userId = userId;
			this.userName = userName;
			UserEmail = userEmail;
			this.userPassword = userPassword;
			this.userPhoneNo = userPhoneNo;
			this.address = address;
		}

		public Integer getUserId() {
			return userId;
		}

		public void setUserId(Integer userId) {
			this.userId = userId;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getUserEmail() {
			return UserEmail;
		}

		public void setUserEmail(String userEmail) {
			UserEmail = userEmail;
		}

		public String getUserPassword() {
			return userPassword;
		}

		public void setUserPassword(String userPassword) {
			this.userPassword = userPassword;
		}

		public String getUserPhoneNo() {
			return userPhoneNo;
		}

		public void setUserPhoneNo(String userPhoneNo) {
			this.userPhoneNo = userPhoneNo;
		}

		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
		}

		public User() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
	    

}
