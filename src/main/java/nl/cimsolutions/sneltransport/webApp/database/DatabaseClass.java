package nl.cimsolutions.sneltransport.webApp.database;

import java.util.HashMap;
import java.util.Map;

import nl.cimsolutions.sneltransport.webApp.OrderLine;
import nl.cimsolutions.sneltransport.webApp.model.Product;

public class DatabaseClass {

	public static Map<Long, Product> products = new HashMap<>();
	public static Map<Long, OrderLine> orderlines = new HashMap<>();
	
	public static Map<Long, Product> getProduct(){
		return products;
	}
	
	public static Map<Long, OrderLine> getOrderLine(){
		return orderlines;
	}
}
