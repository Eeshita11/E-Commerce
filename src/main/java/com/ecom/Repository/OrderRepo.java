package com.ecom.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.Model.Orders;

@Repository
public interface OrderRepo extends JpaRepository<Orders, Integer>
{

}
