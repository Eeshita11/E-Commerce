package com.ecom.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Address 
{
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer addressId;
	    private String addressName;
	    private String addressLandMark;
	    private String addressState;
	    private String addressPhoneNumber;
	    private String addressZipCode;

	    @ManyToOne()
	    @JoinColumn(name = "fk_user_id")
	    private User user;

		public Address(Integer addressId, String addressName, String addressLandMark, String addressState,
				String addressPhoneNumber, String addressZipCode, User user) {
			super();
			this.addressId = addressId;
			this.addressName = addressName;
			this.addressLandMark = addressLandMark;
			this.addressState = addressState;
			this.addressPhoneNumber = addressPhoneNumber;
			this.addressZipCode = addressZipCode;
			this.user = user;
		}

		public Integer getAddressId() {
			return addressId;
		}

		public void setAddressId(Integer addressId) {
			this.addressId = addressId;
		}

		public String getAddressName() {
			return addressName;
		}

		public void setAddressName(String addressName) {
			this.addressName = addressName;
		}

		public String getAddressLandMark() {
			return addressLandMark;
		}

		public void setAddressLandMark(String addressLandMark) {
			this.addressLandMark = addressLandMark;
		}

		public String getAddressState() {
			return addressState;
		}

		public void setAddressState(String addressState) {
			this.addressState = addressState;
		}

		public String getAddressPhoneNumber() {
			return addressPhoneNumber;
		}

		public void setAddressPhoneNumber(String addressPhoneNumber) {
			this.addressPhoneNumber = addressPhoneNumber;
		}

		public String getAddressZipCode() {
			return addressZipCode;
		}

		public void setAddressZipCode(String addressZipCode) {
			this.addressZipCode = addressZipCode;
		}

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}

		public Address() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
	    

}
