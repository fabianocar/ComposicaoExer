package entities;

public class OrdemItem {
	
	private Integer quantity;
	private Double price;
	
	private Product product;
	
	public OrdemItem () {
		
	}
	
	public OrdemItem (Integer Quantity, Double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}
	
	public Integer getQuantity() {
		return quantity;
	}
	
	

}
