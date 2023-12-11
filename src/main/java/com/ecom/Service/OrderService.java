package com.ecom.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.Model.Orders;
import com.ecom.Repository.OrderRepo;

@Service
public class OrderService 
{
	   @Autowired
	    OrderRepo OrderRepo;

	    public Optional<Orders> getOrderById(Integer id) //variable can either hold an instance of the Address class or no value at all.
	    {
	        return OrderRepo.findById(id);
	    }

	    public String placeAnOrder(Orders order) //To place an order
	    {
	        OrderRepo.save(order);
	        return "Order Placed :) !";
	    }

	    public List<Orders> getAllOrders() //To get list of orders
	    {
	        return (List<Orders>) OrderRepo.findAll();
	    }

	    public String deleteOrderById(Integer id) //To delete order using id
	    {
	        OrderRepo.deleteById(id);
	        return "Order Cancelled :( !";
	    }

}
