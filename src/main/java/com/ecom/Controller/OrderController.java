package com.ecom.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.Model.Orders;
import com.ecom.Service.OrderService;

@RestController
public class OrderController 
{
	    @Autowired
	    OrderService orderService;

	    //Post
	    @PostMapping("order")
	    public String placeAnOrder(@RequestBody Orders orders)
	    {
	        return orderService.placeAnOrder(orders);
	    }

	    @GetMapping("Orders")
	    public List<Orders> getAllOrders()
	    {
	        return orderService.getAllOrders();
	    }
	    
	    @GetMapping("Order/{id}")
	    public Optional<Orders> getOrderById(@PathVariable Integer id)
	    {
	        return orderService.getOrderById(id);
	    }

	    @DeleteMapping("order/{id}")
	    public String deleteOrderById(@PathVariable Integer id)
	    {
	        return orderService.deleteOrderById(id);
	    }

}
