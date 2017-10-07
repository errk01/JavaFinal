/*
 * Jerrad Stutzman, Erik Taylor 
 * CST-135
 * 9-22-2017 
 * */

public class drink extends Product
{
	private double floz;
	public drink(String name, int quantity, double price,double floz)
	{
		super(name, quantity, price);
		this.floz= floz;
	}
	
	public drink()
	{
		super();
		this.floz=0;
	}
			
	public  drink (drink d)
	{
		super(d);
		this.floz=d.floz;
	}

	public double getFloz()
	{
		return floz;
	}

	public void setFloz(double floz)
	{
		this.floz = floz;
	}
	
	@Override
	public String toString()
	{
		return super.toString() + "drink [floz=" + floz + "]";
	}
}

	
	