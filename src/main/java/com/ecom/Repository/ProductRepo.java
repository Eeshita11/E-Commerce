package com.ecom.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.Model.Product;
import com.ecom.enums.ProductCategory;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>
{

	List<Product> findByProductCategory(ProductCategory category);

}
