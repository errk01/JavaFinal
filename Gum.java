
public class Gum extends Product
{
	private String mint;

	public Gum(String name, int quantity, double price, String mint)
	{
		super(name, quantity, price);
		this.mint = mint;
		
	}

	public Gum()
	{
		super();
		this.mint="";
	}

	public Gum(Gum G)
	{
		super(G);
		this.mint = G.mint;
		
	}

	public String getMint()
	{
		return mint;
	}

	public void setMint(String mint)
	{
		this.mint = mint;
	}

	@Override
	public String toString()
	{
		return "Gum [mint=" + mint + "]";
	}

}
