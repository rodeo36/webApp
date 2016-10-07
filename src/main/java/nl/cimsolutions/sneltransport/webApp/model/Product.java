package nl.cimsolutions.sneltransport.webApp.model;

import java.io.Serializable;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement
public class Product{

	private Long ProductID;
	private String Name;
	private String Code;
	private double Price;
	private Long CategoryID;
	
	public Product(){
		
	}
	
	public Product(Long productID, String name, String code, double price, Long categoryID) {
		super();
		ProductID = productID;
		Name = name;
		Code = code;
		Price = price;
		CategoryID = categoryID;
	}
	
	public Long getProductID() {
		return ProductID;
	}
	public void setProductID(Long productID) {
		ProductID = productID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCode() {
		return Code;
	}
	public void setCode(String code) {
		Code = code;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public Long getCategoryID() {
		return CategoryID;
	}
	public void setCategoryID(Long categoryID) {
		CategoryID = categoryID;
	}
	

	
}
