package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Product_Controller {
	
	@Autowired
	Product_Service service;
	@Autowired
	Product_Repository prorepository;
	
	//This method is for adding a record
	@PostMapping("Addproduct")
	public ResponseEntity<Product_Entity> addproduct(@RequestBody Product_Entity pro){
		
		return ResponseEntity.ok(service.insert(pro));
	}
	

	//This method is for retrieving all the records
	@GetMapping("getallproducts")
	public List<Product_Entity> getproducts(){
		return service.getallProducts();
	}
    
	//This method is for retrieving record by id.
	@GetMapping("getproductby/{id}")
	public Product_Entity findbyproductid(@PathVariable int id)
	{
		return prorepository.findbyid(id);
	}
	
	//This method is for deleting record by id
	@DeleteMapping("deleteproduct/{id}")
    public ResponseEntity<String> deleteMed(@PathVariable int id){
		
		return ResponseEntity.ok(service.deletebyid(id));
	}
	
	//This method is for updating record by id.
	@PutMapping("updateproduct/{id}")
	public ResponseEntity<Product_Entity> updateMed(@RequestBody Product_Entity prod,@PathVariable int id){
		
		return ResponseEntity.ok(service.update(prod));
	}
}
