/*
 * Jerrad Stutzman, Erik Taylor 
 * CST-135
 * 9-22-2017 
 * */

public class Snack extends Product
{


	public Snack(String name, int quantity, double price)
	{
		super(name, quantity, price);
		
	}
	public Snack()
	{
		this("",0,0);
	}

	public Snack(Snack s)
	{
		super(s);
	}


	
	

}
