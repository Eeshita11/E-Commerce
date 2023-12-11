package com.ecom.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.Model.Product;
import com.ecom.Repository.ProductRepo;
import com.ecom.enums.ProductCategory;

@Service
public class ProductService 
{
	    @Autowired
	    ProductRepo ProductRepo;

	    public String addAProduct(Product product) //For adding a product
	    {
	        ProductRepo.save(product);
	        return "Product added :) !";
	    }

	    public List<Product> getProducts() //To get list of products
	    {
	       return (List<Product>) ProductRepo.findAll();
	    }

	    public Optional<Product> getProduct(Integer id) //variable can either hold an instance of the Address class or no value at all.
	    {
	        return ProductRepo.findById(id);
	    }

	    public List<Product> getProductByCategory(ProductCategory category) //To get product with category
	    {
	        return ProductRepo.findByProductCategory(category);
	    }

	    public String addListOfProducts(List<Product> products) //To add list of products
	    {
	        ProductRepo.saveAll(products);
	        return "Products are added :) !";
	    }

	    public String deleteProductById(Integer id) //To delete product using id
	    {
	        ProductRepo.deleteById(id);
	        return "Product removed !";
	    }
}
