package nl.cimsolutions.sneltransport.webApp.resources;

import java.io.Serializable;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import nl.cimsolutions.sneltransport.webApp.model.Product;
import nl.cimsolutions.sneltransport.webApp.service.ProductService;

@Path ("/products")
public class ProductController {

	
	ProductService productService = new ProductService();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Product> getMessages(){
		return productService.getAllProducts();
	}
	
	@GET
	@Path("/{productId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Product getProduct(@PathParam("productId") long productId){
		return productService.getProduct(productId);
		
	}
	@POST 
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Product addProduct(Product product){
		return productService.addProduct(product);
	}

	
}

