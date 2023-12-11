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

import com.ecom.Model.Product;
import com.ecom.Service.ProductService;
import com.ecom.enums.ProductCategory;

@RestController
public class ProductController 
{
	    @Autowired
	    ProductService productService;

	    //Post
	    @PostMapping("product")
	    public String addAProduct(@RequestBody Product product)
	    {
	        return  productService.addAProduct(product);
	    }

	    @PostMapping("products")
	    public String addListOfProducts(@RequestBody List<Product> products) 
	    {
	    	return productService.addListOfProducts(products);
	    }


	    @GetMapping("product/{Id}")
	    public Optional<Product> getProduct(@PathVariable Integer Id)
	    {
	        return productService.getProduct(Id);
	    }

	    @GetMapping("products")
	    public List<Product> getProducts()
	    {
	        return productService.getProducts();
	    }
	    
	    @GetMapping("products/{category}")
	    public List<Product> getProductsByCategory(@PathVariable ProductCategory category)
	    {
	        return productService.getProductByCategory(category);
	    }
	    
	    @DeleteMapping("product/{id}")
	    public String deleteProductById(@PathVariable Integer id)
	    {
	        return productService.deleteProductById(id);
	    }

}
