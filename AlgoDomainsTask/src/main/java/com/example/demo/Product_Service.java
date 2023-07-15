package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Product_Service {
	
	@Autowired
	Product_Repository repo;  //Attired with JPA repository to access the CRUD methods
	
	
	
	//Insert
	public Product_Entity insert(Product_Entity p)
	{
		if(p.getProductcategory().equals("Electronics"))
		{
			p.setDiscount(15);
			p.setGst(18);
			p.setDeliverycharge(350);
		}
		else if (p.getProductcategory().equals("Home Appliances")) 
		{
			p.setDiscount(0.22);
			p.setGst(0.24);
			p.setDeliverycharge(800);
		}
		
		else if(p.getProductcategory().equals("Clothing"))
		{
			p.setDiscount(40);
			p.setGst(12);
			p.setDeliverycharge(0);
		}
		else if(p.getProductcategory().equals("Furniture"))
		{
			p.setDiscount(10);
			p.setGst(18);
			p.setDeliverycharge(300);
		}
		
		double discount_amount=(p.getDiscount()*p.getProductprice())/100;  //Discount amount calculation
		p.setDiscount(discount_amount);
		
		double product_price=p.getProductprice()-p.getDiscount();
		p.setProductprice(product_price);
		
		double gst_amount=(p.getGst()*p.getProductprice())/100;            //GST calculation
		p.setGst(gst_amount);
		
		double final_price=p.getProductprice()+p.getGst()+p.getDeliverycharge(); //final price calculation
		p.setFinalprice(final_price);
		
		
		return repo.save(p);    //Using this records will be saved.
		
	}
	
	
	//Retrieve
    
	public List<Product_Entity> getallProducts()
	{
		return repo.findAll();
	}
	
	//Delete
	public String deletebyid(int id)
	{
		repo.deleteById(id);
		return "deleted the id value:"+id;
	}
	
	//Update
	public Product_Entity update(Product_Entity p)
	{
		Product_Entity pp=repo.findbyid(p.getProductid());
		
		pp.setProductname(p.getProductname());
		pp.setProducttype(p.getProducttype());
		pp.setProductprice(p.getProductprice());
		return repo.save(pp);
		
	}
	

}
