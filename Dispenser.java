import java.util.ArrayList;
import java.util.Collections;

/*
 * Jerrad Stutzman, Erik Taylor 
 * CST-135
 * 9-22-2017 
 * */

public class Dispenser
{	
	private Product[] items;
	public void dispenser() 
	
	{	
		
		
		
		/* use to compare products price 
		*public static void sort(Array)
		*/
		
		
	ArrayList<Product> items = new ArrayList<Product>();
	
	items.add(new candy("M&M", 2, 1, false));		
	items.add(new candy("Snickers",5,1, false));		
	items.add(new candy("PayDay",3,1, false));
	items.add(new candy("ABAZABA", 4,1, false));
	items.add(new candy("Tootsie roll", 6, 1, false));
	items.add(new candy("Gummy bears", 7,2,false));
	items.add(new candy("Lemon Heads",6, 1, false));
	
	items.add(new drink("DR.Pepper", 7, 1, 12));
	items.add(new drink("Coke Cola", 5,2, 12));		
	items.add(new drink("Diet Coke", 6, 2, 12));
	items.add(new drink("Root Beer", 9, 2, 12));
	items.add(new drink("Arrowhead", 2, 3, 12));
	items.add(new drink("Naked juice", 4, 3, 12));
	
	Collections.sort(items);
	
	for(int i = 0; i < items.size(); i++ ) {
		
		System.out.println(items.get(i).getName());
		}

	
	
	  }
  }

