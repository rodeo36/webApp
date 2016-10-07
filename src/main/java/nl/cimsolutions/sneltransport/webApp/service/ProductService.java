package nl.cimsolutions.sneltransport.webApp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import nl.cimsolutions.sneltransport.webApp.database.DatabaseClass;
import nl.cimsolutions.sneltransport.webApp.model.Product;

public class ProductService {
	
	private Map<Long, Product> products = DatabaseClass.getProduct();
	
	
	public ProductService(){
		products.put(2L, new Product(2L,"Zaky", "A925B", 20, 2L));	
		products.put(1L, new Product(1L,"Khaoula", "A525B", 26.25, 15L));
	}
	
	public List<Product> getAllProducts(){
		
//		Product pr1 = new Product(1L, "Khaoula", "A525B", 26.25, 15L);
//		Product pr2 = new Product(2L, "Zaky", "A925C", 23, 15L);	
//		List<Product> list = new ArrayList<>();
//		list.add(pr1);
//		list.add(pr2);
//		return list;
		
		return new ArrayList<Product>(products.values());
	
	}
	
	public Product getProduct(long id){
		
		return products.get(id);
	}
	
	public Product addProduct(Product product){
		product.setProductID((long) (products.size()+1));
		products.put(product.getProductID(), product);
		return product;
	}
	
	public Product updateProduct(Product product){
		if (product.getProductID() <= 0){
			return null;
		}
		products.put(product.getProductID(), product);
		return product;
	}
	
	public Product removeProduct(Long id){
		
		return products.remove(id);
	}
	
}
