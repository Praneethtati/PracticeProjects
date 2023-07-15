package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Product_Repository extends JpaRepository<Product_Entity, Integer> {
	
	@Query("select p from Product_Entity p where p.productid=?1")
	public Product_Entity findbyid(int id);

}
