


public class City 
{
	private String name;
	private int numOccupants;
	private int cost;
	
	public City (String n)
	{
		name = n;
		numOccupants = 0;
		cost = 10;
	}
	
	public int getCost ()
	{
		return cost;
	}
	
	public int getNumOccupants ()
	{
		return numOccupants;
	}
	
	public String getName ()
	{
		return name;
	}
	
	public void incrementCost ()
	{
		cost += 5;
	}
	
	public boolean isAvailable (int step)
	{
		if (step == numOccupants)
			return false;
		
		return true;
	}
	
	public String toString ()
	{
		return name + " ";
	}
}















