/*
 * Jerrad Stutzman, Erik Taylor 
 * CST-135
 * 9-22-2017 
 * */

public class candy extends Product{

private boolean hard;



	public candy(String name, int quantity, double price, boolean hard)
	{
		super(name, quantity, price);
		this.hard=hard;
		
	}
	
	public candy()
	{
		super();
		this.hard = false;
	}
	public  candy (candy c) {
		super(c);
		this.hard = c.hard;
	}

}
