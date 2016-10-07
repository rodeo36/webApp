package nl.cimsolutions.sneltransport.webApp;

public class OrderLine {
	private Long ProductID;
	private Long OrderID;
	
	public OrderLine(){
		
	}
	
	public OrderLine(Long productID, Long orderID) {
		super();
		ProductID = productID;
		OrderID = orderID;
	}
	
	public Long getProductID() {
		return ProductID;
	}
	
	public void setProductID(Long productID) {
		ProductID = productID;
	}
	
	public Long getOrderID() {
		return OrderID;
	}
	
	public void setOrderID(Long orderID) {
		OrderID = orderID;
	}
	
	
}
