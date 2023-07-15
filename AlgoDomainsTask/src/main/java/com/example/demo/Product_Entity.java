package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Product_Entity {
	
	@Id
	private int productid;
	private String productname;
	private String producttype;
	private String productcategory;
	private double productprice;
	private double discount;
	private double gst;
	private double deliverycharge;
    private double finalprice;
}
