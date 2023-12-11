package com.ecom.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.Model.Address;
import com.ecom.Repository.AddressRepo;

@Service
public class AddressService 
{
	@Autowired
    AddressRepo AddressRepo;

    public String addAddress(Address address) //To add address
    {
        AddressRepo.save(address);
        return "Address added :) !";
    }

    public List<Address> getAddresses()//To get addresses
    {
        return (List<Address>) AddressRepo.findAll();
    }

    public Optional<Address> getAddress(Integer id)  //variable can either hold an instance of the Address class or no value at all.
    {
        return AddressRepo.findById(id);
    }

    public String addListOfUsers(List<Address> addresses) //To add list of users with address
    {
        AddressRepo.saveAll(addresses);
        return "Addresses Added :) !";
    }

    public String deleteAddressById(Integer id)  //To delete addressby id
    {
        AddressRepo.deleteById(id);

        return "Address removed !";
    }

}
