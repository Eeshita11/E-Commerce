package com.ecom.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.Model.Address;
import com.ecom.Service.AddressService;

@RestController
public class AddressController 
{
	@Autowired
    AddressService addressService;
	
    //Get
    @GetMapping("addresses")
    public List<Address> getAddresses()
    {
        return  addressService.getAddresses();
    }
    
    @GetMapping("address/{Id}")
    public Optional<Address> getAddress(@PathVariable Integer Id)
    {
        return addressService.getAddress(Id);
    }
    
    //Post
    @PostMapping("address")
    public String addAddress(@RequestBody Address address)
    {
        return addressService.addAddress(address);
    }
    
    /*@PostMapping("addresses")
    public String addListOfUsers(@RequestBody List<Address> address) 
    {
    	return addressService.addListOfUsers(address);
    }*/
    
    @PostMapping("/saveAddresses")
    public ResponseEntity<String> saveAddresses(@RequestBody AddressListWrapper addressListWrapper) 
    {
        List<Address> addresses = addressListWrapper.getAddresses();
        
        return ResponseEntity.ok("Addresses saved successfully");
    }


    @DeleteMapping("address/{id}")
    public String deleteAddressById(@PathVariable Integer id)
    {
    	return addressService.deleteAddressById(id);
    }

}
