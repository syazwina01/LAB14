package Part3.model;

import java.io.Serializable;

/**
 * This class represents a Product
 * 
 * @author Syazwina
 *
 */
public class Product implements Serializable {
	
	private int productId;
	private String name;
	private double price;
	
	public int getProductId() {
		return productId;
	}
	
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	

}