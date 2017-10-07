/*
 * Jerrad Stutzman, Erik Taylor 
 * CST-135
 * 9-22-2017 
 * */

public class chip extends Product
{
	private String flavor;

	public chip(String name, int quantity, double price, String flavor)
	{
		super(name, quantity, price);
		this.flavor = flavor;
		// TODO Auto-generated constructor stub
	}
	
	public chip(){
		super();
		this.flavor ="";
	}
	public  chip (chip c) {
		super(c);
		this.flavor = c.flavor;
	}

	/**
	 * @return the flavor
	 */
	public String getFlavor()
	{
		return flavor;
	}

	/**
	 * @param flavor the flavor to set
	 */
	public void setFlavor(String flavor)
	{
		this.flavor = flavor;
	}

	@Override
	public String toString()
	{
		return "chip [flavor=" + flavor + "]";
	}

}
