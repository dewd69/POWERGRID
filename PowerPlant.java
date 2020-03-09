
import java.util.ArrayList;

public class PowerPlant 
{
	private int ID;
	private int numPowered;
	private ArrayList <Resource> cost;
	
	public PowerPlant (int id, int num, ArrayList <Resource> c)
	{
		ID = id;
		numPowered = num;
		cost = c;
	}
	
	public int getID ()
	{
		return ID;
	}
	
	public int getNumPowered ()
	{
		return numPowered;
	}
	
	public ArrayList <Resource> getCost ()
	{
		return cost;
	}
}
