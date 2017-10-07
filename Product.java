/*
 * 
 * Jerrad Stutzman, Erik Taylor 
 * CST-135
 * 9-22-2017 
 * */


public class Product implements Comparable<Product>
{
	// name String  variable
	public int compareTo(Product p) {
		return this.name.compareTo(p.getName());
	}
	private String name;
	private int quantity;
	private double price;
	
	// Product constructor
public Product(String  name, int quantity, double price) {
	this.name = name;
	this.quantity = quantity;
	this.price = price;
}


public Product()
{
	this("",0,0);
}

public Product(Product p)
{
	this(p.name, p.quantity, p.price);
}

//gets the name of the product
public String getName()
{
	return name;
}

/** * 
 * @return the quantity
 */
public int getQuantity()
{
	return quantity;
}
//toString calls name, quantity, price
@Override
public String toString()
{
	return "Product [name=" + name + ", quantity=" + quantity + ", price=" + price + "]";
}

/**
 * @param quantity the quantity to set
 */
public void setQuantity(int quantity)
{
	this.quantity = quantity;
}

/**
 * @return the price
 */
public double getPrice()
{
	return price;
}

/**
 * @param price the price to set
 */
public void setPrice(double price)
{
	this.price = price;
}


}
