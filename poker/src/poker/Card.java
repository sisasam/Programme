package poker;

public class Card {

	private String farbe;
	private String wert;
	
	public String getFarbe() 
	{
		return farbe;
	}
	public void setFarbe(String farbe) 
	{
		this.farbe = farbe;
	}
	public String getWert() 
	{
		return wert;
	}
	public void setWert(String wert) 
	{
		this.wert = wert;
	}
	
	public String toString() 
	{
		return farbe + " " + wert;
	}
	
	public static void main(String[] args) 
	{


	}

}
