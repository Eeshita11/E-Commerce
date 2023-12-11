package com.ecom.Controller;

import java.util.List;

import com.ecom.Model.Address;

public class AddressListWrapper //is used to structure the input or output of an API endpoint.
{
	 private List<Address> addresses;
    
	/**Generated getters and setters **/
	public List<Address> getAddresses() 
	{
		return addresses;
	}

	public void setAddresses(List<Address> addresses) 
	{
		this.addresses = addresses;
	}
	 
}
