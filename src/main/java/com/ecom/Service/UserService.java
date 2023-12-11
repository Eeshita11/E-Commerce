package com.ecom.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.Model.Address;
import com.ecom.Model.User;
import com.ecom.Repository.UserRepo;

@Service
public class UserService 
{
	    @Autowired
	    UserRepo UserRepo;

	    public String addUser(User user) //For adding user
	    {
	        UserRepo.save(user);

	        return "User added :) !";
	    }

	    public List<User> getUsers() //To get list of users
	    {
	        return  (List<User>)  UserRepo.findAll();
	    }

	    public Optional<User> getUser(Integer id) //variable can either hold an instance of the Address class or no value at all.
	    {
	        return UserRepo.findById(id);
	    }

	    public String updateUserAddressByUserId(Address address, Integer id) //To update user address with userid
	    {
	        User user = UserRepo.findById(id).orElse(null);
	        if (user == null) 
	        {
	            return "User not found :( !";
	        }

	        user.setAddress(address);
	        return "User address updated :) !";
	    }

	    public String addListOfUsers(List<User> users) //For adding list of users
	    {
	        UserRepo.saveAll(users);

	        return "Users are Added :) !";
	    }

	    public String deleteUserById(Integer id) //To delete users by id
	    {
	        UserRepo.deleteById(id);

	        return "User Removed !";
	    }
}
